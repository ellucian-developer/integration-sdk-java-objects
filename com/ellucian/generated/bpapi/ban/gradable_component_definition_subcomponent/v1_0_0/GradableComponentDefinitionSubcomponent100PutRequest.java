
package com.ellucian.generated.bpapi.ban.gradable_component_definition_subcomponent.v1_0_0;

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
    "criteria.totalScore",
    "seqNo",
    "criteria.bestOfSub",
    "criteria.shrscomDueDate",
    "dueDate",
    "passInd",
    "description",
    "criteria.inclInd",
    "componentSort",
    "criteria.compResitRule",
    "criteria.passInd",
    "criteria.date",
    "minPassScore",
    "criteria.shrscomSubSet",
    "subResitRule",
    "criteria.shrscomWeight",
    "criteria.subSet",
    "criteria.shrscomPassInd",
    "criteria.shrscomAnonymousInd",
    "criteria.shrscomDescription",
    "criteria.shrscomSeqNo",
    "criteria.seqNo",
    "subSet",
    "criteria.gradeScale",
    "criteria.subsetOfSub",
    "crn",
    "criteria.shrscomName",
    "criteria.shrscomGschName",
    "subLateRule",
    "criteria.minPassScore",
    "criteria.description",
    "weight",
    "criteria.shrscomTotalScore",
    "criteria.name",
    "anonymousInd",
    "totalScore",
    "criteria.shrscomExists",
    "gschName",
    "criteria.compLateRule",
    "criteria.andorSeqNo",
    "criteria.shrscomMinPassScore",
    "criteria.shrscomSubResitRule",
    "name",
    "criteria.shrscomSubLateRule",
    "criteria.anonymousInd",
    "criteria.weight",
    "termCode"
})
@Generated("jsonschema2pojo")
public class GradableComponentDefinitionSubcomponent100PutRequest {

    /**
     * Swrexam Total Score
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.totalScore")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_TOTAL_SCORE")
    private Double criteriaTotalScore;
    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SEQ_NO")
    private Double seqNo;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_BEST_OF_SUB
     * 
     */
    @JsonProperty("criteria.bestOfSub")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_BEST_OF_SUB")
    private Double criteriaBestOfSub;
    /**
     * Due Date
     * <p>
     * Lineage reference object : SHRSCOM_DUE_DATE
     * 
     */
    @JsonProperty("criteria.shrscomDueDate")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_DUE_DATE")
    private Date criteriaShrscomDueDate;
    /**
     * Due Date
     * <p>
     * Lineage reference object : SHRSCOM_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_DUE_DATE")
    private Date dueDate;
    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_PASS_IND")
    private String passInd;
    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_DESCRIPTION")
    private String description;
    /**
     * Swrexam Include In Final
     * <p>
     * Lineage reference object : SHRGCOM_INCL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.inclInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_INCL_IND")
    private String criteriaInclInd;
    /**
     * Sort by And/Or Sequence
     * <p>
     * Lineage reference object : componentSort
     * 
     */
    @JsonProperty("componentSort")
    @JsonPropertyDescription("Lineage reference object : componentSort")
    private Object componentSort;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.compResitRule")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul")
    private String criteriaCompResitRule;
    /**
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("criteria.passInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_PASS_IND")
    private String criteriaPassInd;
    /**
     * Swrexam Date
     * <p>
     * Lineage reference object : SHRGCOM_DATE
     * 
     */
    @JsonProperty("criteria.date")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_DATE")
    private Date criteriaDate;
    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("minPassScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_MIN_PASS_SCORE")
    private Double minPassScore;
    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("criteria.shrscomSubSet")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_SET")
    private String criteriaShrscomSubSet;
    /**
     * Resist Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRule")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul")
    private String subResitRule;
    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomWeight")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_WEIGHT")
    private Double criteriaShrscomWeight;
    /**
     * Swrexam Sect Crn
     * <p>
     * Lineage reference object : SHRGCOM_SUB_SET
     * 
     */
    @JsonProperty("criteria.subSet")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SUB_SET")
    private String criteriaSubSet;
    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("criteria.shrscomPassInd")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_PASS_IND")
    private String criteriaShrscomPassInd;
    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("criteria.shrscomAnonymousInd")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_ANONYMOUS_IND")
    private String criteriaShrscomAnonymousInd;
    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomDescription")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_DESCRIPTION")
    private String criteriaShrscomDescription;
    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.shrscomSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SEQ_NO")
    private Double criteriaShrscomSeqNo;
    /**
     * Sequence
     * <p>
     * Lineage reference object : SHRGCOM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SEQ_NO")
    private Double criteriaSeqNo;
    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_SET")
    private String subSet;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_GRADE_SCALE, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("criteria.gradeScale")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_GRADE_SCALE, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse")
    private String criteriaGradeScale;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_SUBSET_OF_SUB
     * 
     */
    @JsonProperty("criteria.subsetOfSub")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SUBSET_OF_SUB")
    private Double criteriaSubsetOfSub;
    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : crn")
    private Object crn;
    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomName")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_NAME")
    private String criteriaShrscomName;
    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomGschName")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse")
    private String criteriaShrscomGschName;
    /**
     * Late Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRule")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String subLateRule;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("criteria.minPassScore")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_MIN_PASS_SCORE")
    private Double criteriaMinPassScore;
    /**
     * Swrexam Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("criteria.description")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_DESCRIPTION")
    private String criteriaDescription;
    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_WEIGHT")
    private Double weight;
    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomTotalScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_TOTAL_SCORE")
    private Double criteriaShrscomTotalScore;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.name")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_NAME")
    private String criteriaName;
    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("anonymousInd")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_ANONYMOUS_IND")
    private String anonymousInd;
    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("totalScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_TOTAL_SCORE")
    private Double totalScore;
    @JsonProperty("criteria.shrscomExists")
    private String criteriaShrscomExists;
    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("gschName")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse")
    private String gschName;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.compLateRule")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String criteriaCompLateRule;
    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRGCOM_ANDOR_SEQ_NO
     * 
     */
    @JsonProperty("criteria.andorSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_ANDOR_SEQ_NO")
    private Double criteriaAndorSeqNo;
    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("criteria.shrscomMinPassScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_MIN_PASS_SCORE")
    private Double criteriaShrscomMinPassScore;
    /**
     * Resist Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.shrscomSubResitRule")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul")
    private String criteriaShrscomSubResitRule;
    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_NAME")
    private String name;
    /**
     * Late Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.shrscomSubLateRule")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String criteriaShrscomSubLateRule;
    /**
     * Lineage reference object : SHRGCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("criteria.anonymousInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_ANONYMOUS_IND")
    private String criteriaAnonymousInd;
    /**
     * Swrexam Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("criteria.weight")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_WEIGHT")
    private Double criteriaWeight;
    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : termCode, Lookup lineage reference object : stvterm")
    private Object termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Swrexam Total Score
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.totalScore")
    public Double getCriteriaTotalScore() {
        return criteriaTotalScore;
    }

    /**
     * Swrexam Total Score
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.totalScore")
    public void setCriteriaTotalScore(Double criteriaTotalScore) {
        this.criteriaTotalScore = criteriaTotalScore;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaTotalScore(Double criteriaTotalScore) {
        this.criteriaTotalScore = criteriaTotalScore;
        return this;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_BEST_OF_SUB
     * 
     */
    @JsonProperty("criteria.bestOfSub")
    public Double getCriteriaBestOfSub() {
        return criteriaBestOfSub;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_BEST_OF_SUB
     * 
     */
    @JsonProperty("criteria.bestOfSub")
    public void setCriteriaBestOfSub(Double criteriaBestOfSub) {
        this.criteriaBestOfSub = criteriaBestOfSub;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaBestOfSub(Double criteriaBestOfSub) {
        this.criteriaBestOfSub = criteriaBestOfSub;
        return this;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : SHRSCOM_DUE_DATE
     * 
     */
    @JsonProperty("criteria.shrscomDueDate")
    public Date getCriteriaShrscomDueDate() {
        return criteriaShrscomDueDate;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : SHRSCOM_DUE_DATE
     * 
     */
    @JsonProperty("criteria.shrscomDueDate")
    public void setCriteriaShrscomDueDate(Date criteriaShrscomDueDate) {
        this.criteriaShrscomDueDate = criteriaShrscomDueDate;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomDueDate(Date criteriaShrscomDueDate) {
        this.criteriaShrscomDueDate = criteriaShrscomDueDate;
        return this;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : SHRSCOM_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : SHRSCOM_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    public String getPassInd() {
        return passInd;
    }

    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    public void setPassInd(String passInd) {
        this.passInd = passInd;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withPassInd(String passInd) {
        this.passInd = passInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Swrexam Include In Final
     * <p>
     * Lineage reference object : SHRGCOM_INCL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.inclInd")
    public String getCriteriaInclInd() {
        return criteriaInclInd;
    }

    /**
     * Swrexam Include In Final
     * <p>
     * Lineage reference object : SHRGCOM_INCL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.inclInd")
    public void setCriteriaInclInd(String criteriaInclInd) {
        this.criteriaInclInd = criteriaInclInd;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaInclInd(String criteriaInclInd) {
        this.criteriaInclInd = criteriaInclInd;
        return this;
    }

    /**
     * Sort by And/Or Sequence
     * <p>
     * Lineage reference object : componentSort
     * 
     */
    @JsonProperty("componentSort")
    public Object getComponentSort() {
        return componentSort;
    }

    /**
     * Sort by And/Or Sequence
     * <p>
     * Lineage reference object : componentSort
     * 
     */
    @JsonProperty("componentSort")
    public void setComponentSort(Object componentSort) {
        this.componentSort = componentSort;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withComponentSort(Object componentSort) {
        this.componentSort = componentSort;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.compResitRule")
    public String getCriteriaCompResitRule() {
        return criteriaCompResitRule;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.compResitRule")
    public void setCriteriaCompResitRule(String criteriaCompResitRule) {
        this.criteriaCompResitRule = criteriaCompResitRule;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaCompResitRule(String criteriaCompResitRule) {
        this.criteriaCompResitRule = criteriaCompResitRule;
        return this;
    }

    /**
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("criteria.passInd")
    public String getCriteriaPassInd() {
        return criteriaPassInd;
    }

    /**
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("criteria.passInd")
    public void setCriteriaPassInd(String criteriaPassInd) {
        this.criteriaPassInd = criteriaPassInd;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaPassInd(String criteriaPassInd) {
        this.criteriaPassInd = criteriaPassInd;
        return this;
    }

    /**
     * Swrexam Date
     * <p>
     * Lineage reference object : SHRGCOM_DATE
     * 
     */
    @JsonProperty("criteria.date")
    public Date getCriteriaDate() {
        return criteriaDate;
    }

    /**
     * Swrexam Date
     * <p>
     * Lineage reference object : SHRGCOM_DATE
     * 
     */
    @JsonProperty("criteria.date")
    public void setCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
        return this;
    }

    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("minPassScore")
    public Double getMinPassScore() {
        return minPassScore;
    }

    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("minPassScore")
    public void setMinPassScore(Double minPassScore) {
        this.minPassScore = minPassScore;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withMinPassScore(Double minPassScore) {
        this.minPassScore = minPassScore;
        return this;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("criteria.shrscomSubSet")
    public String getCriteriaShrscomSubSet() {
        return criteriaShrscomSubSet;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("criteria.shrscomSubSet")
    public void setCriteriaShrscomSubSet(String criteriaShrscomSubSet) {
        this.criteriaShrscomSubSet = criteriaShrscomSubSet;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomSubSet(String criteriaShrscomSubSet) {
        this.criteriaShrscomSubSet = criteriaShrscomSubSet;
        return this;
    }

    /**
     * Resist Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRule")
    public String getSubResitRule() {
        return subResitRule;
    }

    /**
     * Resist Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRule")
    public void setSubResitRule(String subResitRule) {
        this.subResitRule = subResitRule;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withSubResitRule(String subResitRule) {
        this.subResitRule = subResitRule;
        return this;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomWeight")
    public Double getCriteriaShrscomWeight() {
        return criteriaShrscomWeight;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomWeight")
    public void setCriteriaShrscomWeight(Double criteriaShrscomWeight) {
        this.criteriaShrscomWeight = criteriaShrscomWeight;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomWeight(Double criteriaShrscomWeight) {
        this.criteriaShrscomWeight = criteriaShrscomWeight;
        return this;
    }

    /**
     * Swrexam Sect Crn
     * <p>
     * Lineage reference object : SHRGCOM_SUB_SET
     * 
     */
    @JsonProperty("criteria.subSet")
    public String getCriteriaSubSet() {
        return criteriaSubSet;
    }

    /**
     * Swrexam Sect Crn
     * <p>
     * Lineage reference object : SHRGCOM_SUB_SET
     * 
     */
    @JsonProperty("criteria.subSet")
    public void setCriteriaSubSet(String criteriaSubSet) {
        this.criteriaSubSet = criteriaSubSet;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaSubSet(String criteriaSubSet) {
        this.criteriaSubSet = criteriaSubSet;
        return this;
    }

    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("criteria.shrscomPassInd")
    public String getCriteriaShrscomPassInd() {
        return criteriaShrscomPassInd;
    }

    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("criteria.shrscomPassInd")
    public void setCriteriaShrscomPassInd(String criteriaShrscomPassInd) {
        this.criteriaShrscomPassInd = criteriaShrscomPassInd;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomPassInd(String criteriaShrscomPassInd) {
        this.criteriaShrscomPassInd = criteriaShrscomPassInd;
        return this;
    }

    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("criteria.shrscomAnonymousInd")
    public String getCriteriaShrscomAnonymousInd() {
        return criteriaShrscomAnonymousInd;
    }

    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("criteria.shrscomAnonymousInd")
    public void setCriteriaShrscomAnonymousInd(String criteriaShrscomAnonymousInd) {
        this.criteriaShrscomAnonymousInd = criteriaShrscomAnonymousInd;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomAnonymousInd(String criteriaShrscomAnonymousInd) {
        this.criteriaShrscomAnonymousInd = criteriaShrscomAnonymousInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomDescription")
    public String getCriteriaShrscomDescription() {
        return criteriaShrscomDescription;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomDescription")
    public void setCriteriaShrscomDescription(String criteriaShrscomDescription) {
        this.criteriaShrscomDescription = criteriaShrscomDescription;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomDescription(String criteriaShrscomDescription) {
        this.criteriaShrscomDescription = criteriaShrscomDescription;
        return this;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.shrscomSeqNo")
    public Double getCriteriaShrscomSeqNo() {
        return criteriaShrscomSeqNo;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.shrscomSeqNo")
    public void setCriteriaShrscomSeqNo(Double criteriaShrscomSeqNo) {
        this.criteriaShrscomSeqNo = criteriaShrscomSeqNo;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomSeqNo(Double criteriaShrscomSeqNo) {
        this.criteriaShrscomSeqNo = criteriaShrscomSeqNo;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SHRGCOM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    public Double getCriteriaSeqNo() {
        return criteriaSeqNo;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SHRGCOM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    public void setCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
        return this;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    public String getSubSet() {
        return subSet;
    }

    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    public void setSubSet(String subSet) {
        this.subSet = subSet;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withSubSet(String subSet) {
        this.subSet = subSet;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_GRADE_SCALE, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("criteria.gradeScale")
    public String getCriteriaGradeScale() {
        return criteriaGradeScale;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_GRADE_SCALE, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("criteria.gradeScale")
    public void setCriteriaGradeScale(String criteriaGradeScale) {
        this.criteriaGradeScale = criteriaGradeScale;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaGradeScale(String criteriaGradeScale) {
        this.criteriaGradeScale = criteriaGradeScale;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_SUBSET_OF_SUB
     * 
     */
    @JsonProperty("criteria.subsetOfSub")
    public Double getCriteriaSubsetOfSub() {
        return criteriaSubsetOfSub;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_SUBSET_OF_SUB
     * 
     */
    @JsonProperty("criteria.subsetOfSub")
    public void setCriteriaSubsetOfSub(Double criteriaSubsetOfSub) {
        this.criteriaSubsetOfSub = criteriaSubsetOfSub;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaSubsetOfSub(Double criteriaSubsetOfSub) {
        this.criteriaSubsetOfSub = criteriaSubsetOfSub;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    public Object getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    public void setCrn(Object crn) {
        this.crn = crn;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCrn(Object crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomName")
    public String getCriteriaShrscomName() {
        return criteriaShrscomName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomName")
    public void setCriteriaShrscomName(String criteriaShrscomName) {
        this.criteriaShrscomName = criteriaShrscomName;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomName(String criteriaShrscomName) {
        this.criteriaShrscomName = criteriaShrscomName;
        return this;
    }

    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomGschName")
    public String getCriteriaShrscomGschName() {
        return criteriaShrscomGschName;
    }

    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomGschName")
    public void setCriteriaShrscomGschName(String criteriaShrscomGschName) {
        this.criteriaShrscomGschName = criteriaShrscomGschName;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomGschName(String criteriaShrscomGschName) {
        this.criteriaShrscomGschName = criteriaShrscomGschName;
        return this;
    }

    /**
     * Late Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRule")
    public String getSubLateRule() {
        return subLateRule;
    }

    /**
     * Late Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRule")
    public void setSubLateRule(String subLateRule) {
        this.subLateRule = subLateRule;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withSubLateRule(String subLateRule) {
        this.subLateRule = subLateRule;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("criteria.minPassScore")
    public Double getCriteriaMinPassScore() {
        return criteriaMinPassScore;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("criteria.minPassScore")
    public void setCriteriaMinPassScore(Double criteriaMinPassScore) {
        this.criteriaMinPassScore = criteriaMinPassScore;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaMinPassScore(Double criteriaMinPassScore) {
        this.criteriaMinPassScore = criteriaMinPassScore;
        return this;
    }

    /**
     * Swrexam Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("criteria.description")
    public String getCriteriaDescription() {
        return criteriaDescription;
    }

    /**
     * Swrexam Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("criteria.description")
    public void setCriteriaDescription(String criteriaDescription) {
        this.criteriaDescription = criteriaDescription;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaDescription(String criteriaDescription) {
        this.criteriaDescription = criteriaDescription;
        return this;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomTotalScore")
    public Double getCriteriaShrscomTotalScore() {
        return criteriaShrscomTotalScore;
    }

    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("criteria.shrscomTotalScore")
    public void setCriteriaShrscomTotalScore(Double criteriaShrscomTotalScore) {
        this.criteriaShrscomTotalScore = criteriaShrscomTotalScore;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomTotalScore(Double criteriaShrscomTotalScore) {
        this.criteriaShrscomTotalScore = criteriaShrscomTotalScore;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.name")
    public String getCriteriaName() {
        return criteriaName;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.name")
    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
        return this;
    }

    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("anonymousInd")
    public String getAnonymousInd() {
        return anonymousInd;
    }

    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("anonymousInd")
    public void setAnonymousInd(String anonymousInd) {
        this.anonymousInd = anonymousInd;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withAnonymousInd(String anonymousInd) {
        this.anonymousInd = anonymousInd;
        return this;
    }

    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("totalScore")
    public Double getTotalScore() {
        return totalScore;
    }

    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("totalScore")
    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withTotalScore(Double totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    @JsonProperty("criteria.shrscomExists")
    public String getCriteriaShrscomExists() {
        return criteriaShrscomExists;
    }

    @JsonProperty("criteria.shrscomExists")
    public void setCriteriaShrscomExists(String criteriaShrscomExists) {
        this.criteriaShrscomExists = criteriaShrscomExists;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomExists(String criteriaShrscomExists) {
        this.criteriaShrscomExists = criteriaShrscomExists;
        return this;
    }

    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("gschName")
    public String getGschName() {
        return gschName;
    }

    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("gschName")
    public void setGschName(String gschName) {
        this.gschName = gschName;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withGschName(String gschName) {
        this.gschName = gschName;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.compLateRule")
    public String getCriteriaCompLateRule() {
        return criteriaCompLateRule;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.compLateRule")
    public void setCriteriaCompLateRule(String criteriaCompLateRule) {
        this.criteriaCompLateRule = criteriaCompLateRule;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaCompLateRule(String criteriaCompLateRule) {
        this.criteriaCompLateRule = criteriaCompLateRule;
        return this;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRGCOM_ANDOR_SEQ_NO
     * 
     */
    @JsonProperty("criteria.andorSeqNo")
    public Double getCriteriaAndorSeqNo() {
        return criteriaAndorSeqNo;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRGCOM_ANDOR_SEQ_NO
     * 
     */
    @JsonProperty("criteria.andorSeqNo")
    public void setCriteriaAndorSeqNo(Double criteriaAndorSeqNo) {
        this.criteriaAndorSeqNo = criteriaAndorSeqNo;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaAndorSeqNo(Double criteriaAndorSeqNo) {
        this.criteriaAndorSeqNo = criteriaAndorSeqNo;
        return this;
    }

    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("criteria.shrscomMinPassScore")
    public Double getCriteriaShrscomMinPassScore() {
        return criteriaShrscomMinPassScore;
    }

    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("criteria.shrscomMinPassScore")
    public void setCriteriaShrscomMinPassScore(Double criteriaShrscomMinPassScore) {
        this.criteriaShrscomMinPassScore = criteriaShrscomMinPassScore;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomMinPassScore(Double criteriaShrscomMinPassScore) {
        this.criteriaShrscomMinPassScore = criteriaShrscomMinPassScore;
        return this;
    }

    /**
     * Resist Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.shrscomSubResitRule")
    public String getCriteriaShrscomSubResitRule() {
        return criteriaShrscomSubResitRule;
    }

    /**
     * Resist Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.shrscomSubResitRule")
    public void setCriteriaShrscomSubResitRule(String criteriaShrscomSubResitRule) {
        this.criteriaShrscomSubResitRule = criteriaShrscomSubResitRule;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomSubResitRule(String criteriaShrscomSubResitRule) {
        this.criteriaShrscomSubResitRule = criteriaShrscomSubResitRule;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Late Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.shrscomSubLateRule")
    public String getCriteriaShrscomSubLateRule() {
        return criteriaShrscomSubLateRule;
    }

    /**
     * Late Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("criteria.shrscomSubLateRule")
    public void setCriteriaShrscomSubLateRule(String criteriaShrscomSubLateRule) {
        this.criteriaShrscomSubLateRule = criteriaShrscomSubLateRule;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaShrscomSubLateRule(String criteriaShrscomSubLateRule) {
        this.criteriaShrscomSubLateRule = criteriaShrscomSubLateRule;
        return this;
    }

    /**
     * Lineage reference object : SHRGCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("criteria.anonymousInd")
    public String getCriteriaAnonymousInd() {
        return criteriaAnonymousInd;
    }

    /**
     * Lineage reference object : SHRGCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("criteria.anonymousInd")
    public void setCriteriaAnonymousInd(String criteriaAnonymousInd) {
        this.criteriaAnonymousInd = criteriaAnonymousInd;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaAnonymousInd(String criteriaAnonymousInd) {
        this.criteriaAnonymousInd = criteriaAnonymousInd;
        return this;
    }

    /**
     * Swrexam Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("criteria.weight")
    public Double getCriteriaWeight() {
        return criteriaWeight;
    }

    /**
     * Swrexam Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("criteria.weight")
    public void setCriteriaWeight(Double criteriaWeight) {
        this.criteriaWeight = criteriaWeight;
    }

    public GradableComponentDefinitionSubcomponent100PutRequest withCriteriaWeight(Double criteriaWeight) {
        this.criteriaWeight = criteriaWeight;
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

    public GradableComponentDefinitionSubcomponent100PutRequest withTermCode(Object termCode) {
        this.termCode = termCode;
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

    public GradableComponentDefinitionSubcomponent100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradableComponentDefinitionSubcomponent100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTotalScore");
        sb.append('=');
        sb.append(((this.criteriaTotalScore == null)?"<null>":this.criteriaTotalScore));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("criteriaBestOfSub");
        sb.append('=');
        sb.append(((this.criteriaBestOfSub == null)?"<null>":this.criteriaBestOfSub));
        sb.append(',');
        sb.append("criteriaShrscomDueDate");
        sb.append('=');
        sb.append(((this.criteriaShrscomDueDate == null)?"<null>":this.criteriaShrscomDueDate));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("passInd");
        sb.append('=');
        sb.append(((this.passInd == null)?"<null>":this.passInd));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("criteriaInclInd");
        sb.append('=');
        sb.append(((this.criteriaInclInd == null)?"<null>":this.criteriaInclInd));
        sb.append(',');
        sb.append("componentSort");
        sb.append('=');
        sb.append(((this.componentSort == null)?"<null>":this.componentSort));
        sb.append(',');
        sb.append("criteriaCompResitRule");
        sb.append('=');
        sb.append(((this.criteriaCompResitRule == null)?"<null>":this.criteriaCompResitRule));
        sb.append(',');
        sb.append("criteriaPassInd");
        sb.append('=');
        sb.append(((this.criteriaPassInd == null)?"<null>":this.criteriaPassInd));
        sb.append(',');
        sb.append("criteriaDate");
        sb.append('=');
        sb.append(((this.criteriaDate == null)?"<null>":this.criteriaDate));
        sb.append(',');
        sb.append("minPassScore");
        sb.append('=');
        sb.append(((this.minPassScore == null)?"<null>":this.minPassScore));
        sb.append(',');
        sb.append("criteriaShrscomSubSet");
        sb.append('=');
        sb.append(((this.criteriaShrscomSubSet == null)?"<null>":this.criteriaShrscomSubSet));
        sb.append(',');
        sb.append("subResitRule");
        sb.append('=');
        sb.append(((this.subResitRule == null)?"<null>":this.subResitRule));
        sb.append(',');
        sb.append("criteriaShrscomWeight");
        sb.append('=');
        sb.append(((this.criteriaShrscomWeight == null)?"<null>":this.criteriaShrscomWeight));
        sb.append(',');
        sb.append("criteriaSubSet");
        sb.append('=');
        sb.append(((this.criteriaSubSet == null)?"<null>":this.criteriaSubSet));
        sb.append(',');
        sb.append("criteriaShrscomPassInd");
        sb.append('=');
        sb.append(((this.criteriaShrscomPassInd == null)?"<null>":this.criteriaShrscomPassInd));
        sb.append(',');
        sb.append("criteriaShrscomAnonymousInd");
        sb.append('=');
        sb.append(((this.criteriaShrscomAnonymousInd == null)?"<null>":this.criteriaShrscomAnonymousInd));
        sb.append(',');
        sb.append("criteriaShrscomDescription");
        sb.append('=');
        sb.append(((this.criteriaShrscomDescription == null)?"<null>":this.criteriaShrscomDescription));
        sb.append(',');
        sb.append("criteriaShrscomSeqNo");
        sb.append('=');
        sb.append(((this.criteriaShrscomSeqNo == null)?"<null>":this.criteriaShrscomSeqNo));
        sb.append(',');
        sb.append("criteriaSeqNo");
        sb.append('=');
        sb.append(((this.criteriaSeqNo == null)?"<null>":this.criteriaSeqNo));
        sb.append(',');
        sb.append("subSet");
        sb.append('=');
        sb.append(((this.subSet == null)?"<null>":this.subSet));
        sb.append(',');
        sb.append("criteriaGradeScale");
        sb.append('=');
        sb.append(((this.criteriaGradeScale == null)?"<null>":this.criteriaGradeScale));
        sb.append(',');
        sb.append("criteriaSubsetOfSub");
        sb.append('=');
        sb.append(((this.criteriaSubsetOfSub == null)?"<null>":this.criteriaSubsetOfSub));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("criteriaShrscomName");
        sb.append('=');
        sb.append(((this.criteriaShrscomName == null)?"<null>":this.criteriaShrscomName));
        sb.append(',');
        sb.append("criteriaShrscomGschName");
        sb.append('=');
        sb.append(((this.criteriaShrscomGschName == null)?"<null>":this.criteriaShrscomGschName));
        sb.append(',');
        sb.append("subLateRule");
        sb.append('=');
        sb.append(((this.subLateRule == null)?"<null>":this.subLateRule));
        sb.append(',');
        sb.append("criteriaMinPassScore");
        sb.append('=');
        sb.append(((this.criteriaMinPassScore == null)?"<null>":this.criteriaMinPassScore));
        sb.append(',');
        sb.append("criteriaDescription");
        sb.append('=');
        sb.append(((this.criteriaDescription == null)?"<null>":this.criteriaDescription));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("criteriaShrscomTotalScore");
        sb.append('=');
        sb.append(((this.criteriaShrscomTotalScore == null)?"<null>":this.criteriaShrscomTotalScore));
        sb.append(',');
        sb.append("criteriaName");
        sb.append('=');
        sb.append(((this.criteriaName == null)?"<null>":this.criteriaName));
        sb.append(',');
        sb.append("anonymousInd");
        sb.append('=');
        sb.append(((this.anonymousInd == null)?"<null>":this.anonymousInd));
        sb.append(',');
        sb.append("totalScore");
        sb.append('=');
        sb.append(((this.totalScore == null)?"<null>":this.totalScore));
        sb.append(',');
        sb.append("criteriaShrscomExists");
        sb.append('=');
        sb.append(((this.criteriaShrscomExists == null)?"<null>":this.criteriaShrscomExists));
        sb.append(',');
        sb.append("gschName");
        sb.append('=');
        sb.append(((this.gschName == null)?"<null>":this.gschName));
        sb.append(',');
        sb.append("criteriaCompLateRule");
        sb.append('=');
        sb.append(((this.criteriaCompLateRule == null)?"<null>":this.criteriaCompLateRule));
        sb.append(',');
        sb.append("criteriaAndorSeqNo");
        sb.append('=');
        sb.append(((this.criteriaAndorSeqNo == null)?"<null>":this.criteriaAndorSeqNo));
        sb.append(',');
        sb.append("criteriaShrscomMinPassScore");
        sb.append('=');
        sb.append(((this.criteriaShrscomMinPassScore == null)?"<null>":this.criteriaShrscomMinPassScore));
        sb.append(',');
        sb.append("criteriaShrscomSubResitRule");
        sb.append('=');
        sb.append(((this.criteriaShrscomSubResitRule == null)?"<null>":this.criteriaShrscomSubResitRule));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("criteriaShrscomSubLateRule");
        sb.append('=');
        sb.append(((this.criteriaShrscomSubLateRule == null)?"<null>":this.criteriaShrscomSubLateRule));
        sb.append(',');
        sb.append("criteriaAnonymousInd");
        sb.append('=');
        sb.append(((this.criteriaAnonymousInd == null)?"<null>":this.criteriaAnonymousInd));
        sb.append(',');
        sb.append("criteriaWeight");
        sb.append('=');
        sb.append(((this.criteriaWeight == null)?"<null>":this.criteriaWeight));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.criteriaPassInd == null)? 0 :this.criteriaPassInd.hashCode()));
        result = ((result* 31)+((this.criteriaDate == null)? 0 :this.criteriaDate.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomName == null)? 0 :this.criteriaShrscomName.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.componentSort == null)? 0 :this.componentSort.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomDueDate == null)? 0 :this.criteriaShrscomDueDate.hashCode()));
        result = ((result* 31)+((this.criteriaCompResitRule == null)? 0 :this.criteriaCompResitRule.hashCode()));
        result = ((result* 31)+((this.subLateRule == null)? 0 :this.subLateRule.hashCode()));
        result = ((result* 31)+((this.criteriaSubSet == null)? 0 :this.criteriaSubSet.hashCode()));
        result = ((result* 31)+((this.criteriaAndorSeqNo == null)? 0 :this.criteriaAndorSeqNo.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomWeight == null)? 0 :this.criteriaShrscomWeight.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomAnonymousInd == null)? 0 :this.criteriaShrscomAnonymousInd.hashCode()));
        result = ((result* 31)+((this.criteriaGradeScale == null)? 0 :this.criteriaGradeScale.hashCode()));
        result = ((result* 31)+((this.criteriaTotalScore == null)? 0 :this.criteriaTotalScore.hashCode()));
        result = ((result* 31)+((this.gschName == null)? 0 :this.gschName.hashCode()));
        result = ((result* 31)+((this.criteriaBestOfSub == null)? 0 :this.criteriaBestOfSub.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNo == null)? 0 :this.criteriaSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaName == null)? 0 :this.criteriaName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomSubSet == null)? 0 :this.criteriaShrscomSubSet.hashCode()));
        result = ((result* 31)+((this.criteriaDescription == null)? 0 :this.criteriaDescription.hashCode()));
        result = ((result* 31)+((this.criteriaMinPassScore == null)? 0 :this.criteriaMinPassScore.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomGschName == null)? 0 :this.criteriaShrscomGschName.hashCode()));
        result = ((result* 31)+((this.passInd == null)? 0 :this.passInd.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomMinPassScore == null)? 0 :this.criteriaShrscomMinPassScore.hashCode()));
        result = ((result* 31)+((this.criteriaCompLateRule == null)? 0 :this.criteriaCompLateRule.hashCode()));
        result = ((result* 31)+((this.minPassScore == null)? 0 :this.minPassScore.hashCode()));
        result = ((result* 31)+((this.subResitRule == null)? 0 :this.subResitRule.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomExists == null)? 0 :this.criteriaShrscomExists.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomSubLateRule == null)? 0 :this.criteriaShrscomSubLateRule.hashCode()));
        result = ((result* 31)+((this.subSet == null)? 0 :this.subSet.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomSubResitRule == null)? 0 :this.criteriaShrscomSubResitRule.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomPassInd == null)? 0 :this.criteriaShrscomPassInd.hashCode()));
        result = ((result* 31)+((this.criteriaSubsetOfSub == null)? 0 :this.criteriaSubsetOfSub.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomSeqNo == null)? 0 :this.criteriaShrscomSeqNo.hashCode()));
        result = ((result* 31)+((this.anonymousInd == null)? 0 :this.anonymousInd.hashCode()));
        result = ((result* 31)+((this.criteriaWeight == null)? 0 :this.criteriaWeight.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomTotalScore == null)? 0 :this.criteriaShrscomTotalScore.hashCode()));
        result = ((result* 31)+((this.totalScore == null)? 0 :this.totalScore.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomDescription == null)? 0 :this.criteriaShrscomDescription.hashCode()));
        result = ((result* 31)+((this.criteriaAnonymousInd == null)? 0 :this.criteriaAnonymousInd.hashCode()));
        result = ((result* 31)+((this.criteriaInclInd == null)? 0 :this.criteriaInclInd.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradableComponentDefinitionSubcomponent100PutRequest) == false) {
            return false;
        }
        GradableComponentDefinitionSubcomponent100PutRequest rhs = ((GradableComponentDefinitionSubcomponent100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaPassInd == rhs.criteriaPassInd)||((this.criteriaPassInd!= null)&&this.criteriaPassInd.equals(rhs.criteriaPassInd)))&&((this.criteriaDate == rhs.criteriaDate)||((this.criteriaDate!= null)&&this.criteriaDate.equals(rhs.criteriaDate))))&&((this.criteriaShrscomName == rhs.criteriaShrscomName)||((this.criteriaShrscomName!= null)&&this.criteriaShrscomName.equals(rhs.criteriaShrscomName))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.componentSort == rhs.componentSort)||((this.componentSort!= null)&&this.componentSort.equals(rhs.componentSort))))&&((this.criteriaShrscomDueDate == rhs.criteriaShrscomDueDate)||((this.criteriaShrscomDueDate!= null)&&this.criteriaShrscomDueDate.equals(rhs.criteriaShrscomDueDate))))&&((this.criteriaCompResitRule == rhs.criteriaCompResitRule)||((this.criteriaCompResitRule!= null)&&this.criteriaCompResitRule.equals(rhs.criteriaCompResitRule))))&&((this.subLateRule == rhs.subLateRule)||((this.subLateRule!= null)&&this.subLateRule.equals(rhs.subLateRule))))&&((this.criteriaSubSet == rhs.criteriaSubSet)||((this.criteriaSubSet!= null)&&this.criteriaSubSet.equals(rhs.criteriaSubSet))))&&((this.criteriaAndorSeqNo == rhs.criteriaAndorSeqNo)||((this.criteriaAndorSeqNo!= null)&&this.criteriaAndorSeqNo.equals(rhs.criteriaAndorSeqNo))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.criteriaShrscomWeight == rhs.criteriaShrscomWeight)||((this.criteriaShrscomWeight!= null)&&this.criteriaShrscomWeight.equals(rhs.criteriaShrscomWeight))))&&((this.criteriaShrscomAnonymousInd == rhs.criteriaShrscomAnonymousInd)||((this.criteriaShrscomAnonymousInd!= null)&&this.criteriaShrscomAnonymousInd.equals(rhs.criteriaShrscomAnonymousInd))))&&((this.criteriaGradeScale == rhs.criteriaGradeScale)||((this.criteriaGradeScale!= null)&&this.criteriaGradeScale.equals(rhs.criteriaGradeScale))))&&((this.criteriaTotalScore == rhs.criteriaTotalScore)||((this.criteriaTotalScore!= null)&&this.criteriaTotalScore.equals(rhs.criteriaTotalScore))))&&((this.gschName == rhs.gschName)||((this.gschName!= null)&&this.gschName.equals(rhs.gschName))))&&((this.criteriaBestOfSub == rhs.criteriaBestOfSub)||((this.criteriaBestOfSub!= null)&&this.criteriaBestOfSub.equals(rhs.criteriaBestOfSub))))&&((this.criteriaSeqNo == rhs.criteriaSeqNo)||((this.criteriaSeqNo!= null)&&this.criteriaSeqNo.equals(rhs.criteriaSeqNo))))&&((this.criteriaName == rhs.criteriaName)||((this.criteriaName!= null)&&this.criteriaName.equals(rhs.criteriaName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaShrscomSubSet == rhs.criteriaShrscomSubSet)||((this.criteriaShrscomSubSet!= null)&&this.criteriaShrscomSubSet.equals(rhs.criteriaShrscomSubSet))))&&((this.criteriaDescription == rhs.criteriaDescription)||((this.criteriaDescription!= null)&&this.criteriaDescription.equals(rhs.criteriaDescription))))&&((this.criteriaMinPassScore == rhs.criteriaMinPassScore)||((this.criteriaMinPassScore!= null)&&this.criteriaMinPassScore.equals(rhs.criteriaMinPassScore))))&&((this.criteriaShrscomGschName == rhs.criteriaShrscomGschName)||((this.criteriaShrscomGschName!= null)&&this.criteriaShrscomGschName.equals(rhs.criteriaShrscomGschName))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.criteriaShrscomMinPassScore == rhs.criteriaShrscomMinPassScore)||((this.criteriaShrscomMinPassScore!= null)&&this.criteriaShrscomMinPassScore.equals(rhs.criteriaShrscomMinPassScore))))&&((this.criteriaCompLateRule == rhs.criteriaCompLateRule)||((this.criteriaCompLateRule!= null)&&this.criteriaCompLateRule.equals(rhs.criteriaCompLateRule))))&&((this.minPassScore == rhs.minPassScore)||((this.minPassScore!= null)&&this.minPassScore.equals(rhs.minPassScore))))&&((this.subResitRule == rhs.subResitRule)||((this.subResitRule!= null)&&this.subResitRule.equals(rhs.subResitRule))))&&((this.criteriaShrscomExists == rhs.criteriaShrscomExists)||((this.criteriaShrscomExists!= null)&&this.criteriaShrscomExists.equals(rhs.criteriaShrscomExists))))&&((this.criteriaShrscomSubLateRule == rhs.criteriaShrscomSubLateRule)||((this.criteriaShrscomSubLateRule!= null)&&this.criteriaShrscomSubLateRule.equals(rhs.criteriaShrscomSubLateRule))))&&((this.subSet == rhs.subSet)||((this.subSet!= null)&&this.subSet.equals(rhs.subSet))))&&((this.criteriaShrscomSubResitRule == rhs.criteriaShrscomSubResitRule)||((this.criteriaShrscomSubResitRule!= null)&&this.criteriaShrscomSubResitRule.equals(rhs.criteriaShrscomSubResitRule))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.criteriaShrscomPassInd == rhs.criteriaShrscomPassInd)||((this.criteriaShrscomPassInd!= null)&&this.criteriaShrscomPassInd.equals(rhs.criteriaShrscomPassInd))))&&((this.criteriaSubsetOfSub == rhs.criteriaSubsetOfSub)||((this.criteriaSubsetOfSub!= null)&&this.criteriaSubsetOfSub.equals(rhs.criteriaSubsetOfSub))))&&((this.criteriaShrscomSeqNo == rhs.criteriaShrscomSeqNo)||((this.criteriaShrscomSeqNo!= null)&&this.criteriaShrscomSeqNo.equals(rhs.criteriaShrscomSeqNo))))&&((this.anonymousInd == rhs.anonymousInd)||((this.anonymousInd!= null)&&this.anonymousInd.equals(rhs.anonymousInd))))&&((this.criteriaWeight == rhs.criteriaWeight)||((this.criteriaWeight!= null)&&this.criteriaWeight.equals(rhs.criteriaWeight))))&&((this.criteriaShrscomTotalScore == rhs.criteriaShrscomTotalScore)||((this.criteriaShrscomTotalScore!= null)&&this.criteriaShrscomTotalScore.equals(rhs.criteriaShrscomTotalScore))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.criteriaShrscomDescription == rhs.criteriaShrscomDescription)||((this.criteriaShrscomDescription!= null)&&this.criteriaShrscomDescription.equals(rhs.criteriaShrscomDescription))))&&((this.criteriaAnonymousInd == rhs.criteriaAnonymousInd)||((this.criteriaAnonymousInd!= null)&&this.criteriaAnonymousInd.equals(rhs.criteriaAnonymousInd))))&&((this.criteriaInclInd == rhs.criteriaInclInd)||((this.criteriaInclInd!= null)&&this.criteriaInclInd.equals(rhs.criteriaInclInd))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
