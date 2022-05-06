
package com.ellucian.generated.bpapi.ban.gradable_component_definition.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    "anonymousInd"
})
@Generated("jsonschema2pojo")
public class GradableComponentDefinition100QapiPost {

    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("crn")
    private String crn;
    @JsonProperty("componentSort")
    private String componentSort;
    @JsonProperty("seqNo")
    private String seqNo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("totalScore")
    private String totalScore;
    @JsonProperty("date")
    private String date;
    @JsonProperty("passInd")
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
    @JsonProperty("minPassScore")
    private String minPassScore;
    @JsonProperty("bestOfSub")
    private String bestOfSub;
    @JsonProperty("subsetOfSub")
    private String subsetOfSub;
    @JsonProperty("anonymousInd")
    private String anonymousInd;
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

    public GradableComponentDefinition100QapiPost withTermCode(String termCode) {
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

    public GradableComponentDefinition100QapiPost withCrn(String crn) {
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

    public GradableComponentDefinition100QapiPost withComponentSort(String componentSort) {
        this.componentSort = componentSort;
        return this;
    }

    @JsonProperty("seqNo")
    public String getSeqNo() {
        return seqNo;
    }

    @JsonProperty("seqNo")
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public GradableComponentDefinition100QapiPost withSeqNo(String seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public GradableComponentDefinition100QapiPost withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GradableComponentDefinition100QapiPost withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public GradableComponentDefinition100QapiPost withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    @JsonProperty("totalScore")
    public String getTotalScore() {
        return totalScore;
    }

    @JsonProperty("totalScore")
    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public GradableComponentDefinition100QapiPost withTotalScore(String totalScore) {
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

    public GradableComponentDefinition100QapiPost withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("passInd")
    public String getPassInd() {
        return passInd;
    }

    @JsonProperty("passInd")
    public void setPassInd(String passInd) {
        this.passInd = passInd;
    }

    public GradableComponentDefinition100QapiPost withPassInd(String passInd) {
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

    public GradableComponentDefinition100QapiPost withInclInd(String inclInd) {
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

    public GradableComponentDefinition100QapiPost withAndorSeqNo(String andorSeqNo) {
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

    public GradableComponentDefinition100QapiPost withGradeScale(String gradeScale) {
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

    public GradableComponentDefinition100QapiPost withCompLateRule(String compLateRule) {
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

    public GradableComponentDefinition100QapiPost withCompResitRule(String compResitRule) {
        this.compResitRule = compResitRule;
        return this;
    }

    @JsonProperty("minPassScore")
    public String getMinPassScore() {
        return minPassScore;
    }

    @JsonProperty("minPassScore")
    public void setMinPassScore(String minPassScore) {
        this.minPassScore = minPassScore;
    }

    public GradableComponentDefinition100QapiPost withMinPassScore(String minPassScore) {
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

    public GradableComponentDefinition100QapiPost withBestOfSub(String bestOfSub) {
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

    public GradableComponentDefinition100QapiPost withSubsetOfSub(String subsetOfSub) {
        this.subsetOfSub = subsetOfSub;
        return this;
    }

    @JsonProperty("anonymousInd")
    public String getAnonymousInd() {
        return anonymousInd;
    }

    @JsonProperty("anonymousInd")
    public void setAnonymousInd(String anonymousInd) {
        this.anonymousInd = anonymousInd;
    }

    public GradableComponentDefinition100QapiPost withAnonymousInd(String anonymousInd) {
        this.anonymousInd = anonymousInd;
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

    public GradableComponentDefinition100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradableComponentDefinition100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.compLateRule == null)? 0 :this.compLateRule.hashCode()));
        result = ((result* 31)+((this.compResitRule == null)? 0 :this.compResitRule.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.passInd == null)? 0 :this.passInd.hashCode()));
        result = ((result* 31)+((this.andorSeqNo == null)? 0 :this.andorSeqNo.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.anonymousInd == null)? 0 :this.anonymousInd.hashCode()));
        result = ((result* 31)+((this.totalScore == null)? 0 :this.totalScore.hashCode()));
        result = ((result* 31)+((this.componentSort == null)? 0 :this.componentSort.hashCode()));
        result = ((result* 31)+((this.subsetOfSub == null)? 0 :this.subsetOfSub.hashCode()));
        result = ((result* 31)+((this.minPassScore == null)? 0 :this.minPassScore.hashCode()));
        result = ((result* 31)+((this.gradeScale == null)? 0 :this.gradeScale.hashCode()));
        result = ((result* 31)+((this.bestOfSub == null)? 0 :this.bestOfSub.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.inclInd == null)? 0 :this.inclInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradableComponentDefinition100QapiPost) == false) {
            return false;
        }
        GradableComponentDefinition100QapiPost rhs = ((GradableComponentDefinition100QapiPost) other);
        return (((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.compLateRule == rhs.compLateRule)||((this.compLateRule!= null)&&this.compLateRule.equals(rhs.compLateRule))))&&((this.compResitRule == rhs.compResitRule)||((this.compResitRule!= null)&&this.compResitRule.equals(rhs.compResitRule))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.andorSeqNo == rhs.andorSeqNo)||((this.andorSeqNo!= null)&&this.andorSeqNo.equals(rhs.andorSeqNo))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.anonymousInd == rhs.anonymousInd)||((this.anonymousInd!= null)&&this.anonymousInd.equals(rhs.anonymousInd))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.componentSort == rhs.componentSort)||((this.componentSort!= null)&&this.componentSort.equals(rhs.componentSort))))&&((this.subsetOfSub == rhs.subsetOfSub)||((this.subsetOfSub!= null)&&this.subsetOfSub.equals(rhs.subsetOfSub))))&&((this.minPassScore == rhs.minPassScore)||((this.minPassScore!= null)&&this.minPassScore.equals(rhs.minPassScore))))&&((this.gradeScale == rhs.gradeScale)||((this.gradeScale!= null)&&this.gradeScale.equals(rhs.gradeScale))))&&((this.bestOfSub == rhs.bestOfSub)||((this.bestOfSub!= null)&&this.bestOfSub.equals(rhs.bestOfSub))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.inclInd == rhs.inclInd)||((this.inclInd!= null)&&this.inclInd.equals(rhs.inclInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
