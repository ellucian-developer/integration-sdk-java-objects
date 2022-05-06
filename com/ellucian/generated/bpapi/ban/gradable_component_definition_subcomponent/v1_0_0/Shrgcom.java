
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
    "compLateRule",
    "compResitRule",
    "seqNo",
    "passInd",
    "andorSeqNo",
    "description",
    "weight",
    "anonymousInd",
    "totalScore",
    "shrscomExists",
    "subsetOfSub",
    "minPassScore",
    "gradeScale",
    "bestOfSub",
    "name",
    "inclInd",
    "subSet"
})
@Generated("jsonschema2pojo")
public class Shrgcom {

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
     * Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("compLateRule")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_COMP_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String compLateRule;
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
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_PASS_IND")
    private String passInd;
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
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_DESCRIPTION")
    private String description;
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
     * Swrexam Total Score
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * (Required)
     * 
     */
    @JsonProperty("totalScore")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_TOTAL_SCORE")
    private Double totalScore;
    @JsonProperty("shrscomExists")
    private String shrscomExists;
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
     * Swrexam Sect Crn
     * <p>
     * Lineage reference object : SHRGCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_SUB_SET")
    private String subSet;
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

    public Shrgcom withDate(Date date) {
        this.date = date;
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

    public Shrgcom withCompLateRule(String compLateRule) {
        this.compLateRule = compLateRule;
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

    public Shrgcom withCompResitRule(String compResitRule) {
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

    public Shrgcom withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
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

    public Shrgcom withPassInd(String passInd) {
        this.passInd = passInd;
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

    public Shrgcom withAndorSeqNo(Double andorSeqNo) {
        this.andorSeqNo = andorSeqNo;
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

    public Shrgcom withDescription(String description) {
        this.description = description;
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

    public Shrgcom withWeight(Double weight) {
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

    public Shrgcom withAnonymousInd(String anonymousInd) {
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

    public Shrgcom withTotalScore(Double totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    @JsonProperty("shrscomExists")
    public String getShrscomExists() {
        return shrscomExists;
    }

    @JsonProperty("shrscomExists")
    public void setShrscomExists(String shrscomExists) {
        this.shrscomExists = shrscomExists;
    }

    public Shrgcom withShrscomExists(String shrscomExists) {
        this.shrscomExists = shrscomExists;
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

    public Shrgcom withSubsetOfSub(Double subsetOfSub) {
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

    public Shrgcom withMinPassScore(Double minPassScore) {
        this.minPassScore = minPassScore;
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

    public Shrgcom withGradeScale(String gradeScale) {
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

    public Shrgcom withBestOfSub(Double bestOfSub) {
        this.bestOfSub = bestOfSub;
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

    public Shrgcom withName(String name) {
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

    public Shrgcom withInclInd(String inclInd) {
        this.inclInd = inclInd;
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

    public Shrgcom withSubSet(String subSet) {
        this.subSet = subSet;
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

    public Shrgcom withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrgcom.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("compLateRule");
        sb.append('=');
        sb.append(((this.compLateRule == null)?"<null>":this.compLateRule));
        sb.append(',');
        sb.append("compResitRule");
        sb.append('=');
        sb.append(((this.compResitRule == null)?"<null>":this.compResitRule));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("passInd");
        sb.append('=');
        sb.append(((this.passInd == null)?"<null>":this.passInd));
        sb.append(',');
        sb.append("andorSeqNo");
        sb.append('=');
        sb.append(((this.andorSeqNo == null)?"<null>":this.andorSeqNo));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("anonymousInd");
        sb.append('=');
        sb.append(((this.anonymousInd == null)?"<null>":this.anonymousInd));
        sb.append(',');
        sb.append("totalScore");
        sb.append('=');
        sb.append(((this.totalScore == null)?"<null>":this.totalScore));
        sb.append(',');
        sb.append("shrscomExists");
        sb.append('=');
        sb.append(((this.shrscomExists == null)?"<null>":this.shrscomExists));
        sb.append(',');
        sb.append("subsetOfSub");
        sb.append('=');
        sb.append(((this.subsetOfSub == null)?"<null>":this.subsetOfSub));
        sb.append(',');
        sb.append("minPassScore");
        sb.append('=');
        sb.append(((this.minPassScore == null)?"<null>":this.minPassScore));
        sb.append(',');
        sb.append("gradeScale");
        sb.append('=');
        sb.append(((this.gradeScale == null)?"<null>":this.gradeScale));
        sb.append(',');
        sb.append("bestOfSub");
        sb.append('=');
        sb.append(((this.bestOfSub == null)?"<null>":this.bestOfSub));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("inclInd");
        sb.append('=');
        sb.append(((this.inclInd == null)?"<null>":this.inclInd));
        sb.append(',');
        sb.append("subSet");
        sb.append('=');
        sb.append(((this.subSet == null)?"<null>":this.subSet));
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
        result = ((result* 31)+((this.shrscomExists == null)? 0 :this.shrscomExists.hashCode()));
        result = ((result* 31)+((this.subsetOfSub == null)? 0 :this.subsetOfSub.hashCode()));
        result = ((result* 31)+((this.minPassScore == null)? 0 :this.minPassScore.hashCode()));
        result = ((result* 31)+((this.gradeScale == null)? 0 :this.gradeScale.hashCode()));
        result = ((result* 31)+((this.bestOfSub == null)? 0 :this.bestOfSub.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.inclInd == null)? 0 :this.inclInd.hashCode()));
        result = ((result* 31)+((this.subSet == null)? 0 :this.subSet.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrgcom) == false) {
            return false;
        }
        Shrgcom rhs = ((Shrgcom) other);
        return ((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.compLateRule == rhs.compLateRule)||((this.compLateRule!= null)&&this.compLateRule.equals(rhs.compLateRule))))&&((this.compResitRule == rhs.compResitRule)||((this.compResitRule!= null)&&this.compResitRule.equals(rhs.compResitRule))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.andorSeqNo == rhs.andorSeqNo)||((this.andorSeqNo!= null)&&this.andorSeqNo.equals(rhs.andorSeqNo))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.anonymousInd == rhs.anonymousInd)||((this.anonymousInd!= null)&&this.anonymousInd.equals(rhs.anonymousInd))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.shrscomExists == rhs.shrscomExists)||((this.shrscomExists!= null)&&this.shrscomExists.equals(rhs.shrscomExists))))&&((this.subsetOfSub == rhs.subsetOfSub)||((this.subsetOfSub!= null)&&this.subsetOfSub.equals(rhs.subsetOfSub))))&&((this.minPassScore == rhs.minPassScore)||((this.minPassScore!= null)&&this.minPassScore.equals(rhs.minPassScore))))&&((this.gradeScale == rhs.gradeScale)||((this.gradeScale!= null)&&this.gradeScale.equals(rhs.gradeScale))))&&((this.bestOfSub == rhs.bestOfSub)||((this.bestOfSub!= null)&&this.bestOfSub.equals(rhs.bestOfSub))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.inclInd == rhs.inclInd)||((this.inclInd!= null)&&this.inclInd.equals(rhs.inclInd))))&&((this.subSet == rhs.subSet)||((this.subSet!= null)&&this.subSet.equals(rhs.subSet))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
