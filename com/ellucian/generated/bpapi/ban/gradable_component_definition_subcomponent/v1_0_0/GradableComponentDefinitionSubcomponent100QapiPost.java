
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
    "termCode",
    "crn",
    "componentSort",
    "seqNo",
    "name",
    "description",
    "weight",
    "totalScore",
    "date",
    "passInd",
    "inclInd",
    "andorSeqNo",
    "gradeScale",
    "compLateRule",
    "compResitRule",
    "minPassScore",
    "bestOfSub",
    "subsetOfSub",
    "anonymousInd",
    "shrscomName",
    "shrscomDescription",
    "shrscomWeight",
    "shrscomTotalScore",
    "dueDate",
    "shrscomPassInd",
    "gschName",
    "subLateRule",
    "subResitRule",
    "shrscomMinPassScore",
    "shrscomSeqNo",
    "subSet",
    "shrscomAnonymousInd"
})
@Generated("jsonschema2pojo")
public class GradableComponentDefinitionSubcomponent100QapiPost {

    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("crn")
    private String crn;
    @JsonProperty("componentSort")
    private String componentSort;
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
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_NAME")
    private String name;
    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_DESCRIPTION")
    private String description;
    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_WEIGHT")
    private Double weight;
    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
     * 
     */
    @JsonProperty("totalScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_TOTAL_SCORE")
    private Double totalScore;
    @JsonProperty("date")
    private String date;
    /**
     * Lineage reference object : SHRSCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_PASS_IND")
    private String passInd;
    @JsonProperty("inclInd")
    private String inclInd;
    @JsonProperty("andorSeqNo")
    private String andorSeqNo;
    @JsonProperty("gradeScale")
    private String gradeScale;
    @JsonProperty("compLateRule")
    private String compLateRule;
    @JsonProperty("compResitRule")
    private String compResitRule;
    /**
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("minPassScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_MIN_PASS_SCORE")
    private Double minPassScore;
    @JsonProperty("bestOfSub")
    private String bestOfSub;
    @JsonProperty("subsetOfSub")
    private String subsetOfSub;
    /**
     * Lineage reference object : SHRSCOM_ANONYMOUS_IND
     * 
     */
    @JsonProperty("anonymousInd")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_ANONYMOUS_IND")
    private String anonymousInd;
    @JsonProperty("shrscomName")
    private String shrscomName;
    @JsonProperty("shrscomDescription")
    private String shrscomDescription;
    @JsonProperty("shrscomWeight")
    private String shrscomWeight;
    @JsonProperty("shrscomTotalScore")
    private String shrscomTotalScore;
    /**
     * Due Date
     * <p>
     * Lineage reference object : SHRSCOM_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_DUE_DATE")
    private Date dueDate;
    @JsonProperty("shrscomPassInd")
    private String shrscomPassInd;
    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * 
     */
    @JsonProperty("gschName")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse")
    private String gschName;
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
     * Resist Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subResitRule")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_RESIT_RULE, Lookup lineage reference object : shbgrul")
    private String subResitRule;
    @JsonProperty("shrscomMinPassScore")
    private String shrscomMinPassScore;
    @JsonProperty("shrscomSeqNo")
    private String shrscomSeqNo;
    /**
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_SET")
    private String subSet;
    @JsonProperty("shrscomAnonymousInd")
    private String shrscomAnonymousInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    @JsonProperty("componentSort")
    public String getComponentSort() {
        return componentSort;
    }

    @JsonProperty("componentSort")
    public void setComponentSort(String componentSort) {
        this.componentSort = componentSort;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withComponentSort(String componentSort) {
        this.componentSort = componentSort;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : SHRSCOM_NAME
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
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRSCOM_DESCRIPTION
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
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRSCOM_WEIGHT
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
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Marked Out of
     * <p>
     * Lineage reference object : SHRSCOM_TOTAL_SCORE
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
     * 
     */
    @JsonProperty("totalScore")
    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withTotalScore(Double totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withDate(String date) {
        this.date = date;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withPassInd(String passInd) {
        this.passInd = passInd;
        return this;
    }

    @JsonProperty("inclInd")
    public String getInclInd() {
        return inclInd;
    }

    @JsonProperty("inclInd")
    public void setInclInd(String inclInd) {
        this.inclInd = inclInd;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withInclInd(String inclInd) {
        this.inclInd = inclInd;
        return this;
    }

    @JsonProperty("andorSeqNo")
    public String getAndorSeqNo() {
        return andorSeqNo;
    }

    @JsonProperty("andorSeqNo")
    public void setAndorSeqNo(String andorSeqNo) {
        this.andorSeqNo = andorSeqNo;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withAndorSeqNo(String andorSeqNo) {
        this.andorSeqNo = andorSeqNo;
        return this;
    }

    @JsonProperty("gradeScale")
    public String getGradeScale() {
        return gradeScale;
    }

    @JsonProperty("gradeScale")
    public void setGradeScale(String gradeScale) {
        this.gradeScale = gradeScale;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withGradeScale(String gradeScale) {
        this.gradeScale = gradeScale;
        return this;
    }

    @JsonProperty("compLateRule")
    public String getCompLateRule() {
        return compLateRule;
    }

    @JsonProperty("compLateRule")
    public void setCompLateRule(String compLateRule) {
        this.compLateRule = compLateRule;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withCompLateRule(String compLateRule) {
        this.compLateRule = compLateRule;
        return this;
    }

    @JsonProperty("compResitRule")
    public String getCompResitRule() {
        return compResitRule;
    }

    @JsonProperty("compResitRule")
    public void setCompResitRule(String compResitRule) {
        this.compResitRule = compResitRule;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withCompResitRule(String compResitRule) {
        this.compResitRule = compResitRule;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withMinPassScore(Double minPassScore) {
        this.minPassScore = minPassScore;
        return this;
    }

    @JsonProperty("bestOfSub")
    public String getBestOfSub() {
        return bestOfSub;
    }

    @JsonProperty("bestOfSub")
    public void setBestOfSub(String bestOfSub) {
        this.bestOfSub = bestOfSub;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withBestOfSub(String bestOfSub) {
        this.bestOfSub = bestOfSub;
        return this;
    }

    @JsonProperty("subsetOfSub")
    public String getSubsetOfSub() {
        return subsetOfSub;
    }

    @JsonProperty("subsetOfSub")
    public void setSubsetOfSub(String subsetOfSub) {
        this.subsetOfSub = subsetOfSub;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withSubsetOfSub(String subsetOfSub) {
        this.subsetOfSub = subsetOfSub;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withAnonymousInd(String anonymousInd) {
        this.anonymousInd = anonymousInd;
        return this;
    }

    @JsonProperty("shrscomName")
    public String getShrscomName() {
        return shrscomName;
    }

    @JsonProperty("shrscomName")
    public void setShrscomName(String shrscomName) {
        this.shrscomName = shrscomName;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withShrscomName(String shrscomName) {
        this.shrscomName = shrscomName;
        return this;
    }

    @JsonProperty("shrscomDescription")
    public String getShrscomDescription() {
        return shrscomDescription;
    }

    @JsonProperty("shrscomDescription")
    public void setShrscomDescription(String shrscomDescription) {
        this.shrscomDescription = shrscomDescription;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withShrscomDescription(String shrscomDescription) {
        this.shrscomDescription = shrscomDescription;
        return this;
    }

    @JsonProperty("shrscomWeight")
    public String getShrscomWeight() {
        return shrscomWeight;
    }

    @JsonProperty("shrscomWeight")
    public void setShrscomWeight(String shrscomWeight) {
        this.shrscomWeight = shrscomWeight;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withShrscomWeight(String shrscomWeight) {
        this.shrscomWeight = shrscomWeight;
        return this;
    }

    @JsonProperty("shrscomTotalScore")
    public String getShrscomTotalScore() {
        return shrscomTotalScore;
    }

    @JsonProperty("shrscomTotalScore")
    public void setShrscomTotalScore(String shrscomTotalScore) {
        this.shrscomTotalScore = shrscomTotalScore;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withShrscomTotalScore(String shrscomTotalScore) {
        this.shrscomTotalScore = shrscomTotalScore;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    @JsonProperty("shrscomPassInd")
    public String getShrscomPassInd() {
        return shrscomPassInd;
    }

    @JsonProperty("shrscomPassInd")
    public void setShrscomPassInd(String shrscomPassInd) {
        this.shrscomPassInd = shrscomPassInd;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withShrscomPassInd(String shrscomPassInd) {
        this.shrscomPassInd = shrscomPassInd;
        return this;
    }

    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SHRSCOM_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
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
     * 
     */
    @JsonProperty("gschName")
    public void setGschName(String gschName) {
        this.gschName = gschName;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withGschName(String gschName) {
        this.gschName = gschName;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withSubLateRule(String subLateRule) {
        this.subLateRule = subLateRule;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withSubResitRule(String subResitRule) {
        this.subResitRule = subResitRule;
        return this;
    }

    @JsonProperty("shrscomMinPassScore")
    public String getShrscomMinPassScore() {
        return shrscomMinPassScore;
    }

    @JsonProperty("shrscomMinPassScore")
    public void setShrscomMinPassScore(String shrscomMinPassScore) {
        this.shrscomMinPassScore = shrscomMinPassScore;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withShrscomMinPassScore(String shrscomMinPassScore) {
        this.shrscomMinPassScore = shrscomMinPassScore;
        return this;
    }

    @JsonProperty("shrscomSeqNo")
    public String getShrscomSeqNo() {
        return shrscomSeqNo;
    }

    @JsonProperty("shrscomSeqNo")
    public void setShrscomSeqNo(String shrscomSeqNo) {
        this.shrscomSeqNo = shrscomSeqNo;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withShrscomSeqNo(String shrscomSeqNo) {
        this.shrscomSeqNo = shrscomSeqNo;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withSubSet(String subSet) {
        this.subSet = subSet;
        return this;
    }

    @JsonProperty("shrscomAnonymousInd")
    public String getShrscomAnonymousInd() {
        return shrscomAnonymousInd;
    }

    @JsonProperty("shrscomAnonymousInd")
    public void setShrscomAnonymousInd(String shrscomAnonymousInd) {
        this.shrscomAnonymousInd = shrscomAnonymousInd;
    }

    public GradableComponentDefinitionSubcomponent100QapiPost withShrscomAnonymousInd(String shrscomAnonymousInd) {
        this.shrscomAnonymousInd = shrscomAnonymousInd;
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

    public GradableComponentDefinitionSubcomponent100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradableComponentDefinitionSubcomponent100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("componentSort");
        sb.append('=');
        sb.append(((this.componentSort == null)?"<null>":this.componentSort));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("totalScore");
        sb.append('=');
        sb.append(((this.totalScore == null)?"<null>":this.totalScore));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("passInd");
        sb.append('=');
        sb.append(((this.passInd == null)?"<null>":this.passInd));
        sb.append(',');
        sb.append("inclInd");
        sb.append('=');
        sb.append(((this.inclInd == null)?"<null>":this.inclInd));
        sb.append(',');
        sb.append("andorSeqNo");
        sb.append('=');
        sb.append(((this.andorSeqNo == null)?"<null>":this.andorSeqNo));
        sb.append(',');
        sb.append("gradeScale");
        sb.append('=');
        sb.append(((this.gradeScale == null)?"<null>":this.gradeScale));
        sb.append(',');
        sb.append("compLateRule");
        sb.append('=');
        sb.append(((this.compLateRule == null)?"<null>":this.compLateRule));
        sb.append(',');
        sb.append("compResitRule");
        sb.append('=');
        sb.append(((this.compResitRule == null)?"<null>":this.compResitRule));
        sb.append(',');
        sb.append("minPassScore");
        sb.append('=');
        sb.append(((this.minPassScore == null)?"<null>":this.minPassScore));
        sb.append(',');
        sb.append("bestOfSub");
        sb.append('=');
        sb.append(((this.bestOfSub == null)?"<null>":this.bestOfSub));
        sb.append(',');
        sb.append("subsetOfSub");
        sb.append('=');
        sb.append(((this.subsetOfSub == null)?"<null>":this.subsetOfSub));
        sb.append(',');
        sb.append("anonymousInd");
        sb.append('=');
        sb.append(((this.anonymousInd == null)?"<null>":this.anonymousInd));
        sb.append(',');
        sb.append("shrscomName");
        sb.append('=');
        sb.append(((this.shrscomName == null)?"<null>":this.shrscomName));
        sb.append(',');
        sb.append("shrscomDescription");
        sb.append('=');
        sb.append(((this.shrscomDescription == null)?"<null>":this.shrscomDescription));
        sb.append(',');
        sb.append("shrscomWeight");
        sb.append('=');
        sb.append(((this.shrscomWeight == null)?"<null>":this.shrscomWeight));
        sb.append(',');
        sb.append("shrscomTotalScore");
        sb.append('=');
        sb.append(((this.shrscomTotalScore == null)?"<null>":this.shrscomTotalScore));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("shrscomPassInd");
        sb.append('=');
        sb.append(((this.shrscomPassInd == null)?"<null>":this.shrscomPassInd));
        sb.append(',');
        sb.append("gschName");
        sb.append('=');
        sb.append(((this.gschName == null)?"<null>":this.gschName));
        sb.append(',');
        sb.append("subLateRule");
        sb.append('=');
        sb.append(((this.subLateRule == null)?"<null>":this.subLateRule));
        sb.append(',');
        sb.append("subResitRule");
        sb.append('=');
        sb.append(((this.subResitRule == null)?"<null>":this.subResitRule));
        sb.append(',');
        sb.append("shrscomMinPassScore");
        sb.append('=');
        sb.append(((this.shrscomMinPassScore == null)?"<null>":this.shrscomMinPassScore));
        sb.append(',');
        sb.append("shrscomSeqNo");
        sb.append('=');
        sb.append(((this.shrscomSeqNo == null)?"<null>":this.shrscomSeqNo));
        sb.append(',');
        sb.append("subSet");
        sb.append('=');
        sb.append(((this.subSet == null)?"<null>":this.subSet));
        sb.append(',');
        sb.append("shrscomAnonymousInd");
        sb.append('=');
        sb.append(((this.shrscomAnonymousInd == null)?"<null>":this.shrscomAnonymousInd));
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
        if ((other instanceof GradableComponentDefinitionSubcomponent100QapiPost) == false) {
            return false;
        }
        GradableComponentDefinitionSubcomponent100QapiPost rhs = ((GradableComponentDefinitionSubcomponent100QapiPost) other);
        return ((((((((((((((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.compResitRule == rhs.compResitRule)||((this.compResitRule!= null)&&this.compResitRule.equals(rhs.compResitRule))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.shrscomSeqNo == rhs.shrscomSeqNo)||((this.shrscomSeqNo!= null)&&this.shrscomSeqNo.equals(rhs.shrscomSeqNo))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.shrscomPassInd == rhs.shrscomPassInd)||((this.shrscomPassInd!= null)&&this.shrscomPassInd.equals(rhs.shrscomPassInd))))&&((this.componentSort == rhs.componentSort)||((this.componentSort!= null)&&this.componentSort.equals(rhs.componentSort))))&&((this.subsetOfSub == rhs.subsetOfSub)||((this.subsetOfSub!= null)&&this.subsetOfSub.equals(rhs.subsetOfSub))))&&((this.minPassScore == rhs.minPassScore)||((this.minPassScore!= null)&&this.minPassScore.equals(rhs.minPassScore))))&&((this.shrscomAnonymousInd == rhs.shrscomAnonymousInd)||((this.shrscomAnonymousInd!= null)&&this.shrscomAnonymousInd.equals(rhs.shrscomAnonymousInd))))&&((this.subResitRule == rhs.subResitRule)||((this.subResitRule!= null)&&this.subResitRule.equals(rhs.subResitRule))))&&((this.gradeScale == rhs.gradeScale)||((this.gradeScale!= null)&&this.gradeScale.equals(rhs.gradeScale))))&&((this.bestOfSub == rhs.bestOfSub)||((this.bestOfSub!= null)&&this.bestOfSub.equals(rhs.bestOfSub))))&&((this.subSet == rhs.subSet)||((this.subSet!= null)&&this.subSet.equals(rhs.subSet))))&&((this.shrscomName == rhs.shrscomName)||((this.shrscomName!= null)&&this.shrscomName.equals(rhs.shrscomName))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.subLateRule == rhs.subLateRule)||((this.subLateRule!= null)&&this.subLateRule.equals(rhs.subLateRule))))&&((this.compLateRule == rhs.compLateRule)||((this.compLateRule!= null)&&this.compLateRule.equals(rhs.compLateRule))))&&((this.andorSeqNo == rhs.andorSeqNo)||((this.andorSeqNo!= null)&&this.andorSeqNo.equals(rhs.andorSeqNo))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.anonymousInd == rhs.anonymousInd)||((this.anonymousInd!= null)&&this.anonymousInd.equals(rhs.anonymousInd))))&&((this.shrscomMinPassScore == rhs.shrscomMinPassScore)||((this.shrscomMinPassScore!= null)&&this.shrscomMinPassScore.equals(rhs.shrscomMinPassScore))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.gschName == rhs.gschName)||((this.gschName!= null)&&this.gschName.equals(rhs.gschName))))&&((this.shrscomWeight == rhs.shrscomWeight)||((this.shrscomWeight!= null)&&this.shrscomWeight.equals(rhs.shrscomWeight))))&&((this.shrscomDescription == rhs.shrscomDescription)||((this.shrscomDescription!= null)&&this.shrscomDescription.equals(rhs.shrscomDescription))))&&((this.shrscomTotalScore == rhs.shrscomTotalScore)||((this.shrscomTotalScore!= null)&&this.shrscomTotalScore.equals(rhs.shrscomTotalScore))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.inclInd == rhs.inclInd)||((this.inclInd!= null)&&this.inclInd.equals(rhs.inclInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
