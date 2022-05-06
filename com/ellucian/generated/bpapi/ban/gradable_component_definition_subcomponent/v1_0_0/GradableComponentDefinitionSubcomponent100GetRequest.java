
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
    "date",
    "compResitRule",
    "seqNo",
    "shrscomSeqNo",
    "passInd",
    "dueDate",
    "description",
    "shrscomPassInd",
    "componentSort",
    "subsetOfSub",
    "minPassScore",
    "shrscomAnonymousInd",
    "subResitRule",
    "gradeScale",
    "bestOfSub",
    "subSet",
    "shrscomName",
    "crn",
    "subLateRule",
    "compLateRule",
    "andorSeqNo",
    "weight",
    "anonymousInd",
    "shrscomMinPassScore",
    "totalScore",
    "gschName",
    "shrscomWeight",
    "shrscomDescription",
    "shrscomTotalScore",
    "name",
    "inclInd",
    "termCode"
})
@Generated("jsonschema2pojo")
public class GradableComponentDefinitionSubcomponent100GetRequest {

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
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("shrscomSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SEQ_NO")
    private Double shrscomSeqNo;
    /**
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_PASS_IND")
    private String passInd;
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
     * Swrexam Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_DESCRIPTION")
    private String description;
    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("shrscomPassInd")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_PASS_IND")
    private String shrscomPassInd;
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
     * Lineage reference object : SHRGCOM_SUBSET_OF_SUB
     * 
     */
    @JsonProperty("subsetOfSub")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SUBSET_OF_SUB")
    private Double subsetOfSub;
    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("minPassScore")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_MIN_PASS_SCORE")
    private Double minPassScore;
    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("shrscomAnonymousInd")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_ANONYMOUS_IND")
    private String shrscomAnonymousInd;
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
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_SET")
    private String subSet;
    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("shrscomName")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_NAME")
    private String shrscomName;
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
     * Lineage reference object : SHRGCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("anonymousInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_ANONYMOUS_IND")
    private String anonymousInd;
    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("shrscomMinPassScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_MIN_PASS_SCORE")
    private Double shrscomMinPassScore;
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
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("shrscomWeight")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_WEIGHT")
    private Double shrscomWeight;
    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("shrscomDescription")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_DESCRIPTION")
    private String shrscomDescription;
    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("shrscomTotalScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_TOTAL_SCORE")
    private Double shrscomTotalScore;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withDate(Date date) {
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

    public GradableComponentDefinitionSubcomponent100GetRequest withCompResitRule(String compResitRule) {
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

    public GradableComponentDefinitionSubcomponent100GetRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("shrscomSeqNo")
    public Double getShrscomSeqNo() {
        return shrscomSeqNo;
    }

    /**
     * And/Or Sequence
     * <p>
     * Lineage reference object : SHRSCOM_SEQ_NO
     * 
     */
    @JsonProperty("shrscomSeqNo")
    public void setShrscomSeqNo(Double shrscomSeqNo) {
        this.shrscomSeqNo = shrscomSeqNo;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withShrscomSeqNo(Double shrscomSeqNo) {
        this.shrscomSeqNo = shrscomSeqNo;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withPassInd(String passInd) {
        this.passInd = passInd;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("shrscomPassInd")
    public String getShrscomPassInd() {
        return shrscomPassInd;
    }

    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("shrscomPassInd")
    public void setShrscomPassInd(String shrscomPassInd) {
        this.shrscomPassInd = shrscomPassInd;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withShrscomPassInd(String shrscomPassInd) {
        this.shrscomPassInd = shrscomPassInd;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withComponentSort(Object componentSort) {
        this.componentSort = componentSort;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withSubsetOfSub(Double subsetOfSub) {
        this.subsetOfSub = subsetOfSub;
        return this;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("minPassScore")
    public Double getMinPassScore() {
        return minPassScore;
    }

    /**
     * Swrexam Name
     * <p>
     * Lineage reference object : SHRGCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("minPassScore")
    public void setMinPassScore(Double minPassScore) {
        this.minPassScore = minPassScore;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withMinPassScore(Double minPassScore) {
        this.minPassScore = minPassScore;
        return this;
    }

    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("shrscomAnonymousInd")
    public String getShrscomAnonymousInd() {
        return shrscomAnonymousInd;
    }

    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("shrscomAnonymousInd")
    public void setShrscomAnonymousInd(String shrscomAnonymousInd) {
        this.shrscomAnonymousInd = shrscomAnonymousInd;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withShrscomAnonymousInd(String shrscomAnonymousInd) {
        this.shrscomAnonymousInd = shrscomAnonymousInd;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withSubResitRule(String subResitRule) {
        this.subResitRule = subResitRule;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withGradeScale(String gradeScale) {
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

    public GradableComponentDefinitionSubcomponent100GetRequest withBestOfSub(Double bestOfSub) {
        this.bestOfSub = bestOfSub;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withSubSet(String subSet) {
        this.subSet = subSet;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("shrscomName")
    public String getShrscomName() {
        return shrscomName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * (Required)
     * 
     */
    @JsonProperty("shrscomName")
    public void setShrscomName(String shrscomName) {
        this.shrscomName = shrscomName;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withShrscomName(String shrscomName) {
        this.shrscomName = shrscomName;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withCrn(Object crn) {
        this.crn = crn;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withSubLateRule(String subLateRule) {
        this.subLateRule = subLateRule;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withCompLateRule(String compLateRule) {
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

    public GradableComponentDefinitionSubcomponent100GetRequest withAndorSeqNo(Double andorSeqNo) {
        this.andorSeqNo = andorSeqNo;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withWeight(Double weight) {
        this.weight = weight;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withAnonymousInd(String anonymousInd) {
        this.anonymousInd = anonymousInd;
        return this;
    }

    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("shrscomMinPassScore")
    public Double getShrscomMinPassScore() {
        return shrscomMinPassScore;
    }

    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("shrscomMinPassScore")
    public void setShrscomMinPassScore(Double shrscomMinPassScore) {
        this.shrscomMinPassScore = shrscomMinPassScore;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withShrscomMinPassScore(Double shrscomMinPassScore) {
        this.shrscomMinPassScore = shrscomMinPassScore;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withTotalScore(Double totalScore) {
        this.totalScore = totalScore;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withGschName(String gschName) {
        this.gschName = gschName;
        return this;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("shrscomWeight")
    public Double getShrscomWeight() {
        return shrscomWeight;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * (Required)
     * 
     */
    @JsonProperty("shrscomWeight")
    public void setShrscomWeight(Double shrscomWeight) {
        this.shrscomWeight = shrscomWeight;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withShrscomWeight(Double shrscomWeight) {
        this.shrscomWeight = shrscomWeight;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("shrscomDescription")
    public String getShrscomDescription() {
        return shrscomDescription;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("shrscomDescription")
    public void setShrscomDescription(String shrscomDescription) {
        this.shrscomDescription = shrscomDescription;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withShrscomDescription(String shrscomDescription) {
        this.shrscomDescription = shrscomDescription;
        return this;
    }

    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("shrscomTotalScore")
    public Double getShrscomTotalScore() {
        return shrscomTotalScore;
    }

    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("shrscomTotalScore")
    public void setShrscomTotalScore(Double shrscomTotalScore) {
        this.shrscomTotalScore = shrscomTotalScore;
    }

    public GradableComponentDefinitionSubcomponent100GetRequest withShrscomTotalScore(Double shrscomTotalScore) {
        this.shrscomTotalScore = shrscomTotalScore;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withName(String name) {
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

    public GradableComponentDefinitionSubcomponent100GetRequest withInclInd(String inclInd) {
        this.inclInd = inclInd;
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

    public GradableComponentDefinitionSubcomponent100GetRequest withTermCode(Object termCode) {
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

    public GradableComponentDefinitionSubcomponent100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradableComponentDefinitionSubcomponent100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("shrscomSeqNo");
        sb.append('=');
        sb.append(((this.shrscomSeqNo == null)?"<null>":this.shrscomSeqNo));
        sb.append(',');
        sb.append("passInd");
        sb.append('=');
        sb.append(((this.passInd == null)?"<null>":this.passInd));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("shrscomPassInd");
        sb.append('=');
        sb.append(((this.shrscomPassInd == null)?"<null>":this.shrscomPassInd));
        sb.append(',');
        sb.append("componentSort");
        sb.append('=');
        sb.append(((this.componentSort == null)?"<null>":this.componentSort));
        sb.append(',');
        sb.append("subsetOfSub");
        sb.append('=');
        sb.append(((this.subsetOfSub == null)?"<null>":this.subsetOfSub));
        sb.append(',');
        sb.append("minPassScore");
        sb.append('=');
        sb.append(((this.minPassScore == null)?"<null>":this.minPassScore));
        sb.append(',');
        sb.append("shrscomAnonymousInd");
        sb.append('=');
        sb.append(((this.shrscomAnonymousInd == null)?"<null>":this.shrscomAnonymousInd));
        sb.append(',');
        sb.append("subResitRule");
        sb.append('=');
        sb.append(((this.subResitRule == null)?"<null>":this.subResitRule));
        sb.append(',');
        sb.append("gradeScale");
        sb.append('=');
        sb.append(((this.gradeScale == null)?"<null>":this.gradeScale));
        sb.append(',');
        sb.append("bestOfSub");
        sb.append('=');
        sb.append(((this.bestOfSub == null)?"<null>":this.bestOfSub));
        sb.append(',');
        sb.append("subSet");
        sb.append('=');
        sb.append(((this.subSet == null)?"<null>":this.subSet));
        sb.append(',');
        sb.append("shrscomName");
        sb.append('=');
        sb.append(((this.shrscomName == null)?"<null>":this.shrscomName));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("subLateRule");
        sb.append('=');
        sb.append(((this.subLateRule == null)?"<null>":this.subLateRule));
        sb.append(',');
        sb.append("compLateRule");
        sb.append('=');
        sb.append(((this.compLateRule == null)?"<null>":this.compLateRule));
        sb.append(',');
        sb.append("andorSeqNo");
        sb.append('=');
        sb.append(((this.andorSeqNo == null)?"<null>":this.andorSeqNo));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("anonymousInd");
        sb.append('=');
        sb.append(((this.anonymousInd == null)?"<null>":this.anonymousInd));
        sb.append(',');
        sb.append("shrscomMinPassScore");
        sb.append('=');
        sb.append(((this.shrscomMinPassScore == null)?"<null>":this.shrscomMinPassScore));
        sb.append(',');
        sb.append("totalScore");
        sb.append('=');
        sb.append(((this.totalScore == null)?"<null>":this.totalScore));
        sb.append(',');
        sb.append("gschName");
        sb.append('=');
        sb.append(((this.gschName == null)?"<null>":this.gschName));
        sb.append(',');
        sb.append("shrscomWeight");
        sb.append('=');
        sb.append(((this.shrscomWeight == null)?"<null>":this.shrscomWeight));
        sb.append(',');
        sb.append("shrscomDescription");
        sb.append('=');
        sb.append(((this.shrscomDescription == null)?"<null>":this.shrscomDescription));
        sb.append(',');
        sb.append("shrscomTotalScore");
        sb.append('=');
        sb.append(((this.shrscomTotalScore == null)?"<null>":this.shrscomTotalScore));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("inclInd");
        sb.append('=');
        sb.append(((this.inclInd == null)?"<null>":this.inclInd));
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
        result = ((result* 31)+((this.compResitRule == null)? 0 :this.compResitRule.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.shrscomSeqNo == null)? 0 :this.shrscomSeqNo.hashCode()));
        result = ((result* 31)+((this.passInd == null)? 0 :this.passInd.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.shrscomPassInd == null)? 0 :this.shrscomPassInd.hashCode()));
        result = ((result* 31)+((this.componentSort == null)? 0 :this.componentSort.hashCode()));
        result = ((result* 31)+((this.subsetOfSub == null)? 0 :this.subsetOfSub.hashCode()));
        result = ((result* 31)+((this.minPassScore == null)? 0 :this.minPassScore.hashCode()));
        result = ((result* 31)+((this.shrscomAnonymousInd == null)? 0 :this.shrscomAnonymousInd.hashCode()));
        result = ((result* 31)+((this.subResitRule == null)? 0 :this.subResitRule.hashCode()));
        result = ((result* 31)+((this.gradeScale == null)? 0 :this.gradeScale.hashCode()));
        result = ((result* 31)+((this.bestOfSub == null)? 0 :this.bestOfSub.hashCode()));
        result = ((result* 31)+((this.subSet == null)? 0 :this.subSet.hashCode()));
        result = ((result* 31)+((this.shrscomName == null)? 0 :this.shrscomName.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.subLateRule == null)? 0 :this.subLateRule.hashCode()));
        result = ((result* 31)+((this.compLateRule == null)? 0 :this.compLateRule.hashCode()));
        result = ((result* 31)+((this.andorSeqNo == null)? 0 :this.andorSeqNo.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.anonymousInd == null)? 0 :this.anonymousInd.hashCode()));
        result = ((result* 31)+((this.shrscomMinPassScore == null)? 0 :this.shrscomMinPassScore.hashCode()));
        result = ((result* 31)+((this.totalScore == null)? 0 :this.totalScore.hashCode()));
        result = ((result* 31)+((this.gschName == null)? 0 :this.gschName.hashCode()));
        result = ((result* 31)+((this.shrscomWeight == null)? 0 :this.shrscomWeight.hashCode()));
        result = ((result* 31)+((this.shrscomDescription == null)? 0 :this.shrscomDescription.hashCode()));
        result = ((result* 31)+((this.shrscomTotalScore == null)? 0 :this.shrscomTotalScore.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.inclInd == null)? 0 :this.inclInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradableComponentDefinitionSubcomponent100GetRequest) == false) {
            return false;
        }
        GradableComponentDefinitionSubcomponent100GetRequest rhs = ((GradableComponentDefinitionSubcomponent100GetRequest) other);
        return ((((((((((((((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.compResitRule == rhs.compResitRule)||((this.compResitRule!= null)&&this.compResitRule.equals(rhs.compResitRule))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.shrscomSeqNo == rhs.shrscomSeqNo)||((this.shrscomSeqNo!= null)&&this.shrscomSeqNo.equals(rhs.shrscomSeqNo))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.shrscomPassInd == rhs.shrscomPassInd)||((this.shrscomPassInd!= null)&&this.shrscomPassInd.equals(rhs.shrscomPassInd))))&&((this.componentSort == rhs.componentSort)||((this.componentSort!= null)&&this.componentSort.equals(rhs.componentSort))))&&((this.subsetOfSub == rhs.subsetOfSub)||((this.subsetOfSub!= null)&&this.subsetOfSub.equals(rhs.subsetOfSub))))&&((this.minPassScore == rhs.minPassScore)||((this.minPassScore!= null)&&this.minPassScore.equals(rhs.minPassScore))))&&((this.shrscomAnonymousInd == rhs.shrscomAnonymousInd)||((this.shrscomAnonymousInd!= null)&&this.shrscomAnonymousInd.equals(rhs.shrscomAnonymousInd))))&&((this.subResitRule == rhs.subResitRule)||((this.subResitRule!= null)&&this.subResitRule.equals(rhs.subResitRule))))&&((this.gradeScale == rhs.gradeScale)||((this.gradeScale!= null)&&this.gradeScale.equals(rhs.gradeScale))))&&((this.bestOfSub == rhs.bestOfSub)||((this.bestOfSub!= null)&&this.bestOfSub.equals(rhs.bestOfSub))))&&((this.subSet == rhs.subSet)||((this.subSet!= null)&&this.subSet.equals(rhs.subSet))))&&((this.shrscomName == rhs.shrscomName)||((this.shrscomName!= null)&&this.shrscomName.equals(rhs.shrscomName))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.subLateRule == rhs.subLateRule)||((this.subLateRule!= null)&&this.subLateRule.equals(rhs.subLateRule))))&&((this.compLateRule == rhs.compLateRule)||((this.compLateRule!= null)&&this.compLateRule.equals(rhs.compLateRule))))&&((this.andorSeqNo == rhs.andorSeqNo)||((this.andorSeqNo!= null)&&this.andorSeqNo.equals(rhs.andorSeqNo))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.anonymousInd == rhs.anonymousInd)||((this.anonymousInd!= null)&&this.anonymousInd.equals(rhs.anonymousInd))))&&((this.shrscomMinPassScore == rhs.shrscomMinPassScore)||((this.shrscomMinPassScore!= null)&&this.shrscomMinPassScore.equals(rhs.shrscomMinPassScore))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.gschName == rhs.gschName)||((this.gschName!= null)&&this.gschName.equals(rhs.gschName))))&&((this.shrscomWeight == rhs.shrscomWeight)||((this.shrscomWeight!= null)&&this.shrscomWeight.equals(rhs.shrscomWeight))))&&((this.shrscomDescription == rhs.shrscomDescription)||((this.shrscomDescription!= null)&&this.shrscomDescription.equals(rhs.shrscomDescription))))&&((this.shrscomTotalScore == rhs.shrscomTotalScore)||((this.shrscomTotalScore!= null)&&this.shrscomTotalScore.equals(rhs.shrscomTotalScore))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.inclInd == rhs.inclInd)||((this.inclInd!= null)&&this.inclInd.equals(rhs.inclInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
