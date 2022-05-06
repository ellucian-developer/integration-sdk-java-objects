
package com.ellucian.generated.bpapi.ban.gradable_component_definition.v1_0_0;

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
    "date",
    "compResitRule",
    "seqNo",
    "criteria.bestOfSub",
    "passInd",
    "description",
    "criteria.inclInd",
    "criteria.compResitRule",
    "criteria.passInd",
    "criteria.date",
    "subsetOfSub",
    "gradeScale",
    "bestOfSub",
    "criteria.subSet",
    "criteria.seqNo",
    "subSet",
    "criteria.gradeScale",
    "criteria.subsetOfSub",
    "crn",
    "criteria.minPassScore",
    "compLateRule",
    "andorSeqNo",
    "criteria.description",
    "weight",
    "criteria.name",
    "anonymousInd",
    "totalScore",
    "criteria.shrscomExists",
    "criteria.compLateRule",
    "criteria.andorSeqNo",
    "name",
    "inclInd",
    "criteria.anonymousInd",
    "criteria.weight",
    "termCode"
})
@Generated("jsonschema2pojo")
public class GradableComponentDefinition100PutRequest {

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
     * Swrexam Date
     * <p>
     * Lineage reference object : SHRGCOM_DATE
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_DATE")
    private Date date;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compResitRule")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul")
    private String compResitRule;
    /**
     * Sequence
     * <p>
     * Lineage reference object : SHRGCOM_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SEQ_NO")
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
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_PASS_IND")
    private String passInd;
    /**
     * Swrexam Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_DESCRIPTION")
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
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_SUBSET_OF_SUB
     * 
     */
    @JsonProperty("subsetOfSub")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SUBSET_OF_SUB")
    private Double subsetOfSub;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_GRADE_SCALE, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("gradeScale")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_GRADE_SCALE, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse")
    private String gradeScale;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_BEST_OF_SUB
     * 
     */
    @JsonProperty("bestOfSub")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_BEST_OF_SUB")
    private Double bestOfSub;
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
     * Sequence
     * <p>
     * Lineage reference object : SHRGCOM_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SEQ_NO")
    private Double criteriaSeqNo;
    /**
     * Swrexam Sect Crn
     * <p>
     * Lineage reference object : SHRGCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SUB_SET")
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
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("criteria.minPassScore")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_MIN_PASS_SCORE")
    private Double criteriaMinPassScore;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRule")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String compLateRule;
    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRGCOM_ANDOR_SEQ_NO
     * 
     */
    @JsonProperty("andorSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_ANDOR_SEQ_NO")
    private Double andorSeqNo;
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
     * Swrexam Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_WEIGHT")
    private Double weight;
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
     * Lineage reference object : SHRGCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("anonymousInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_ANONYMOUS_IND")
    private String anonymousInd;
    /**
     * Swrexam Total Score
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("totalScore")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_TOTAL_SCORE")
    private Double totalScore;
    @JsonProperty("criteria.shrscomExists")
    private String criteriaShrscomExists;
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
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_NAME")
    private String name;
    /**
     * Swrexam Include In Final
     * <p>
     * Lineage reference object : SHRGCOM_INCL_IND
     * (Required)
     * 
     */
    @JsonProperty("inclInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_INCL_IND")
    private String inclInd;
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

    public GradableComponentDefinition100PutRequest withCriteriaTotalScore(Double criteriaTotalScore) {
        this.criteriaTotalScore = criteriaTotalScore;
        return this;
    }

    /**
     * Swrexam Date
     * <p>
     * Lineage reference object : SHRGCOM_DATE
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Swrexam Date
     * <p>
     * Lineage reference object : SHRGCOM_DATE
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public GradableComponentDefinition100PutRequest withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compResitRule")
    public String getCompResitRule() {
        return compResitRule;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compResitRule")
    public void setCompResitRule(String compResitRule) {
        this.compResitRule = compResitRule;
    }

    public GradableComponentDefinition100PutRequest withCompResitRule(String compResitRule) {
        this.compResitRule = compResitRule;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SHRGCOM_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SHRGCOM_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public GradableComponentDefinition100PutRequest withSeqNo(Double seqNo) {
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

    public GradableComponentDefinition100PutRequest withCriteriaBestOfSub(Double criteriaBestOfSub) {
        this.criteriaBestOfSub = criteriaBestOfSub;
        return this;
    }

    /**
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    public String getPassInd() {
        return passInd;
    }

    /**
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    public void setPassInd(String passInd) {
        this.passInd = passInd;
    }

    public GradableComponentDefinition100PutRequest withPassInd(String passInd) {
        this.passInd = passInd;
        return this;
    }

    /**
     * Swrexam Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Swrexam Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GradableComponentDefinition100PutRequest withDescription(String description) {
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

    public GradableComponentDefinition100PutRequest withCriteriaInclInd(String criteriaInclInd) {
        this.criteriaInclInd = criteriaInclInd;
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

    public GradableComponentDefinition100PutRequest withCriteriaCompResitRule(String criteriaCompResitRule) {
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

    public GradableComponentDefinition100PutRequest withCriteriaPassInd(String criteriaPassInd) {
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

    public GradableComponentDefinition100PutRequest withCriteriaDate(Date criteriaDate) {
        this.criteriaDate = criteriaDate;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_SUBSET_OF_SUB
     * 
     */
    @JsonProperty("subsetOfSub")
    public Double getSubsetOfSub() {
        return subsetOfSub;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_SUBSET_OF_SUB
     * 
     */
    @JsonProperty("subsetOfSub")
    public void setSubsetOfSub(Double subsetOfSub) {
        this.subsetOfSub = subsetOfSub;
    }

    public GradableComponentDefinition100PutRequest withSubsetOfSub(Double subsetOfSub) {
        this.subsetOfSub = subsetOfSub;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_GRADE_SCALE, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("gradeScale")
    public String getGradeScale() {
        return gradeScale;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_GRADE_SCALE, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * (Required)
     * 
     */
    @JsonProperty("gradeScale")
    public void setGradeScale(String gradeScale) {
        this.gradeScale = gradeScale;
    }

    public GradableComponentDefinition100PutRequest withGradeScale(String gradeScale) {
        this.gradeScale = gradeScale;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_BEST_OF_SUB
     * 
     */
    @JsonProperty("bestOfSub")
    public Double getBestOfSub() {
        return bestOfSub;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_BEST_OF_SUB
     * 
     */
    @JsonProperty("bestOfSub")
    public void setBestOfSub(Double bestOfSub) {
        this.bestOfSub = bestOfSub;
    }

    public GradableComponentDefinition100PutRequest withBestOfSub(Double bestOfSub) {
        this.bestOfSub = bestOfSub;
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

    public GradableComponentDefinition100PutRequest withCriteriaSubSet(String criteriaSubSet) {
        this.criteriaSubSet = criteriaSubSet;
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

    public GradableComponentDefinition100PutRequest withCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
        return this;
    }

    /**
     * Swrexam Sect Crn
     * <p>
     * Lineage reference object : SHRGCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    public String getSubSet() {
        return subSet;
    }

    /**
     * Swrexam Sect Crn
     * <p>
     * Lineage reference object : SHRGCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    public void setSubSet(String subSet) {
        this.subSet = subSet;
    }

    public GradableComponentDefinition100PutRequest withSubSet(String subSet) {
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

    public GradableComponentDefinition100PutRequest withCriteriaGradeScale(String criteriaGradeScale) {
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

    public GradableComponentDefinition100PutRequest withCriteriaSubsetOfSub(Double criteriaSubsetOfSub) {
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

    public GradableComponentDefinition100PutRequest withCrn(Object crn) {
        this.crn = crn;
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

    public GradableComponentDefinition100PutRequest withCriteriaMinPassScore(Double criteriaMinPassScore) {
        this.criteriaMinPassScore = criteriaMinPassScore;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRule")
    public String getCompLateRule() {
        return compLateRule;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRule")
    public void setCompLateRule(String compLateRule) {
        this.compLateRule = compLateRule;
    }

    public GradableComponentDefinition100PutRequest withCompLateRule(String compLateRule) {
        this.compLateRule = compLateRule;
        return this;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRGCOM_ANDOR_SEQ_NO
     * 
     */
    @JsonProperty("andorSeqNo")
    public Double getAndorSeqNo() {
        return andorSeqNo;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRGCOM_ANDOR_SEQ_NO
     * 
     */
    @JsonProperty("andorSeqNo")
    public void setAndorSeqNo(Double andorSeqNo) {
        this.andorSeqNo = andorSeqNo;
    }

    public GradableComponentDefinition100PutRequest withAndorSeqNo(Double andorSeqNo) {
        this.andorSeqNo = andorSeqNo;
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

    public GradableComponentDefinition100PutRequest withCriteriaDescription(String criteriaDescription) {
        this.criteriaDescription = criteriaDescription;
        return this;
    }

    /**
     * Swrexam Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    /**
     * Swrexam Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public GradableComponentDefinition100PutRequest withWeight(Double weight) {
        this.weight = weight;
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

    public GradableComponentDefinition100PutRequest withCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
        return this;
    }

    /**
     * Lineage reference object : SHRGCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("anonymousInd")
    public String getAnonymousInd() {
        return anonymousInd;
    }

    /**
     * Lineage reference object : SHRGCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("anonymousInd")
    public void setAnonymousInd(String anonymousInd) {
        this.anonymousInd = anonymousInd;
    }

    public GradableComponentDefinition100PutRequest withAnonymousInd(String anonymousInd) {
        this.anonymousInd = anonymousInd;
        return this;
    }

    /**
     * Swrexam Total Score
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("totalScore")
    public Double getTotalScore() {
        return totalScore;
    }

    /**
     * Swrexam Total Score
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("totalScore")
    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public GradableComponentDefinition100PutRequest withTotalScore(Double totalScore) {
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

    public GradableComponentDefinition100PutRequest withCriteriaShrscomExists(String criteriaShrscomExists) {
        this.criteriaShrscomExists = criteriaShrscomExists;
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

    public GradableComponentDefinition100PutRequest withCriteriaCompLateRule(String criteriaCompLateRule) {
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

    public GradableComponentDefinition100PutRequest withCriteriaAndorSeqNo(Double criteriaAndorSeqNo) {
        this.criteriaAndorSeqNo = criteriaAndorSeqNo;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public GradableComponentDefinition100PutRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Swrexam Include In Final
     * <p>
     * Lineage reference object : SHRGCOM_INCL_IND
     * (Required)
     * 
     */
    @JsonProperty("inclInd")
    public String getInclInd() {
        return inclInd;
    }

    /**
     * Swrexam Include In Final
     * <p>
     * Lineage reference object : SHRGCOM_INCL_IND
     * (Required)
     * 
     */
    @JsonProperty("inclInd")
    public void setInclInd(String inclInd) {
        this.inclInd = inclInd;
    }

    public GradableComponentDefinition100PutRequest withInclInd(String inclInd) {
        this.inclInd = inclInd;
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

    public GradableComponentDefinition100PutRequest withCriteriaAnonymousInd(String criteriaAnonymousInd) {
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

    public GradableComponentDefinition100PutRequest withCriteriaWeight(Double criteriaWeight) {
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

    public GradableComponentDefinition100PutRequest withTermCode(Object termCode) {
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

    public GradableComponentDefinition100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradableComponentDefinition100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTotalScore");
        sb.append('=');
        sb.append(((this.criteriaTotalScore == null)?"<null>":this.criteriaTotalScore));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("compResitRule");
        sb.append('=');
        sb.append(((this.compResitRule == null)?"<null>":this.compResitRule));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("criteriaBestOfSub");
        sb.append('=');
        sb.append(((this.criteriaBestOfSub == null)?"<null>":this.criteriaBestOfSub));
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
        sb.append("subsetOfSub");
        sb.append('=');
        sb.append(((this.subsetOfSub == null)?"<null>":this.subsetOfSub));
        sb.append(',');
        sb.append("gradeScale");
        sb.append('=');
        sb.append(((this.gradeScale == null)?"<null>":this.gradeScale));
        sb.append(',');
        sb.append("bestOfSub");
        sb.append('=');
        sb.append(((this.bestOfSub == null)?"<null>":this.bestOfSub));
        sb.append(',');
        sb.append("criteriaSubSet");
        sb.append('=');
        sb.append(((this.criteriaSubSet == null)?"<null>":this.criteriaSubSet));
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
        sb.append("criteriaMinPassScore");
        sb.append('=');
        sb.append(((this.criteriaMinPassScore == null)?"<null>":this.criteriaMinPassScore));
        sb.append(',');
        sb.append("compLateRule");
        sb.append('=');
        sb.append(((this.compLateRule == null)?"<null>":this.compLateRule));
        sb.append(',');
        sb.append("andorSeqNo");
        sb.append('=');
        sb.append(((this.andorSeqNo == null)?"<null>":this.andorSeqNo));
        sb.append(',');
        sb.append("criteriaDescription");
        sb.append('=');
        sb.append(((this.criteriaDescription == null)?"<null>":this.criteriaDescription));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
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
        sb.append("criteriaCompLateRule");
        sb.append('=');
        sb.append(((this.criteriaCompLateRule == null)?"<null>":this.criteriaCompLateRule));
        sb.append(',');
        sb.append("criteriaAndorSeqNo");
        sb.append('=');
        sb.append(((this.criteriaAndorSeqNo == null)?"<null>":this.criteriaAndorSeqNo));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("inclInd");
        sb.append('=');
        sb.append(((this.inclInd == null)?"<null>":this.inclInd));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.criteriaPassInd == null)? 0 :this.criteriaPassInd.hashCode()));
        result = ((result* 31)+((this.criteriaDate == null)? 0 :this.criteriaDate.hashCode()));
        result = ((result* 31)+((this.compResitRule == null)? 0 :this.compResitRule.hashCode()));
        result = ((result* 31)+((this.criteriaMinPassScore == null)? 0 :this.criteriaMinPassScore.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.passInd == null)? 0 :this.passInd.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.criteriaCompLateRule == null)? 0 :this.criteriaCompLateRule.hashCode()));
        result = ((result* 31)+((this.subsetOfSub == null)? 0 :this.subsetOfSub.hashCode()));
        result = ((result* 31)+((this.gradeScale == null)? 0 :this.gradeScale.hashCode()));
        result = ((result* 31)+((this.bestOfSub == null)? 0 :this.bestOfSub.hashCode()));
        result = ((result* 31)+((this.criteriaShrscomExists == null)? 0 :this.criteriaShrscomExists.hashCode()));
        result = ((result* 31)+((this.criteriaCompResitRule == null)? 0 :this.criteriaCompResitRule.hashCode()));
        result = ((result* 31)+((this.subSet == null)? 0 :this.subSet.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.compLateRule == null)? 0 :this.compLateRule.hashCode()));
        result = ((result* 31)+((this.criteriaSubSet == null)? 0 :this.criteriaSubSet.hashCode()));
        result = ((result* 31)+((this.andorSeqNo == null)? 0 :this.andorSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaAndorSeqNo == null)? 0 :this.criteriaAndorSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaSubsetOfSub == null)? 0 :this.criteriaSubsetOfSub.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.anonymousInd == null)? 0 :this.anonymousInd.hashCode()));
        result = ((result* 31)+((this.criteriaWeight == null)? 0 :this.criteriaWeight.hashCode()));
        result = ((result* 31)+((this.criteriaGradeScale == null)? 0 :this.criteriaGradeScale.hashCode()));
        result = ((result* 31)+((this.totalScore == null)? 0 :this.totalScore.hashCode()));
        result = ((result* 31)+((this.criteriaTotalScore == null)? 0 :this.criteriaTotalScore.hashCode()));
        result = ((result* 31)+((this.criteriaBestOfSub == null)? 0 :this.criteriaBestOfSub.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNo == null)? 0 :this.criteriaSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaAnonymousInd == null)? 0 :this.criteriaAnonymousInd.hashCode()));
        result = ((result* 31)+((this.criteriaName == null)? 0 :this.criteriaName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.inclInd == null)? 0 :this.inclInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaInclInd == null)? 0 :this.criteriaInclInd.hashCode()));
        result = ((result* 31)+((this.criteriaDescription == null)? 0 :this.criteriaDescription.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradableComponentDefinition100PutRequest) == false) {
            return false;
        }
        GradableComponentDefinition100PutRequest rhs = ((GradableComponentDefinition100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.criteriaPassInd == rhs.criteriaPassInd)||((this.criteriaPassInd!= null)&&this.criteriaPassInd.equals(rhs.criteriaPassInd))))&&((this.criteriaDate == rhs.criteriaDate)||((this.criteriaDate!= null)&&this.criteriaDate.equals(rhs.criteriaDate))))&&((this.compResitRule == rhs.compResitRule)||((this.compResitRule!= null)&&this.compResitRule.equals(rhs.compResitRule))))&&((this.criteriaMinPassScore == rhs.criteriaMinPassScore)||((this.criteriaMinPassScore!= null)&&this.criteriaMinPassScore.equals(rhs.criteriaMinPassScore))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.criteriaCompLateRule == rhs.criteriaCompLateRule)||((this.criteriaCompLateRule!= null)&&this.criteriaCompLateRule.equals(rhs.criteriaCompLateRule))))&&((this.subsetOfSub == rhs.subsetOfSub)||((this.subsetOfSub!= null)&&this.subsetOfSub.equals(rhs.subsetOfSub))))&&((this.gradeScale == rhs.gradeScale)||((this.gradeScale!= null)&&this.gradeScale.equals(rhs.gradeScale))))&&((this.bestOfSub == rhs.bestOfSub)||((this.bestOfSub!= null)&&this.bestOfSub.equals(rhs.bestOfSub))))&&((this.criteriaShrscomExists == rhs.criteriaShrscomExists)||((this.criteriaShrscomExists!= null)&&this.criteriaShrscomExists.equals(rhs.criteriaShrscomExists))))&&((this.criteriaCompResitRule == rhs.criteriaCompResitRule)||((this.criteriaCompResitRule!= null)&&this.criteriaCompResitRule.equals(rhs.criteriaCompResitRule))))&&((this.subSet == rhs.subSet)||((this.subSet!= null)&&this.subSet.equals(rhs.subSet))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.compLateRule == rhs.compLateRule)||((this.compLateRule!= null)&&this.compLateRule.equals(rhs.compLateRule))))&&((this.criteriaSubSet == rhs.criteriaSubSet)||((this.criteriaSubSet!= null)&&this.criteriaSubSet.equals(rhs.criteriaSubSet))))&&((this.andorSeqNo == rhs.andorSeqNo)||((this.andorSeqNo!= null)&&this.andorSeqNo.equals(rhs.andorSeqNo))))&&((this.criteriaAndorSeqNo == rhs.criteriaAndorSeqNo)||((this.criteriaAndorSeqNo!= null)&&this.criteriaAndorSeqNo.equals(rhs.criteriaAndorSeqNo))))&&((this.criteriaSubsetOfSub == rhs.criteriaSubsetOfSub)||((this.criteriaSubsetOfSub!= null)&&this.criteriaSubsetOfSub.equals(rhs.criteriaSubsetOfSub))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.anonymousInd == rhs.anonymousInd)||((this.anonymousInd!= null)&&this.anonymousInd.equals(rhs.anonymousInd))))&&((this.criteriaWeight == rhs.criteriaWeight)||((this.criteriaWeight!= null)&&this.criteriaWeight.equals(rhs.criteriaWeight))))&&((this.criteriaGradeScale == rhs.criteriaGradeScale)||((this.criteriaGradeScale!= null)&&this.criteriaGradeScale.equals(rhs.criteriaGradeScale))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.criteriaTotalScore == rhs.criteriaTotalScore)||((this.criteriaTotalScore!= null)&&this.criteriaTotalScore.equals(rhs.criteriaTotalScore))))&&((this.criteriaBestOfSub == rhs.criteriaBestOfSub)||((this.criteriaBestOfSub!= null)&&this.criteriaBestOfSub.equals(rhs.criteriaBestOfSub))))&&((this.criteriaSeqNo == rhs.criteriaSeqNo)||((this.criteriaSeqNo!= null)&&this.criteriaSeqNo.equals(rhs.criteriaSeqNo))))&&((this.criteriaAnonymousInd == rhs.criteriaAnonymousInd)||((this.criteriaAnonymousInd!= null)&&this.criteriaAnonymousInd.equals(rhs.criteriaAnonymousInd))))&&((this.criteriaName == rhs.criteriaName)||((this.criteriaName!= null)&&this.criteriaName.equals(rhs.criteriaName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.inclInd == rhs.inclInd)||((this.inclInd!= null)&&this.inclInd.equals(rhs.inclInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaInclInd == rhs.criteriaInclInd)||((this.criteriaInclInd!= null)&&this.criteriaInclInd.equals(rhs.criteriaInclInd))))&&((this.criteriaDescription == rhs.criteriaDescription)||((this.criteriaDescription!= null)&&this.criteriaDescription.equals(rhs.criteriaDescription))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
