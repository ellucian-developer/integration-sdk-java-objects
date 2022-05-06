
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
    "seqNo",
    "dueDate",
    "passInd",
    "description",
    "weight",
    "anonymousInd",
    "totalScore",
    "gschName",
    "minPassScore",
    "subResitRule",
    "name",
    "subSet",
    "subLateRule"
})
@Generated("jsonschema2pojo")
public class Shrscom {

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
     * Pass Mark
     * <p>
     * Lineage reference object : SHRSCOM_MIN_PASS_SCORE
     * 
     */
    @JsonProperty("minPassScore")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_MIN_PASS_SCORE")
    private Double minPassScore;
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
     * And/Or
     * <p>
     * Lineage reference object : SHRSCOM_SUB_SET
     * 
     */
    @JsonProperty("subSet")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_SET")
    private String subSet;
    /**
     * Late Rule
     * <p>
     * Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul
     * 
     */
    @JsonProperty("subLateRule")
    @JsonPropertyDescription("Lineage reference object : SHRSCOM_SUB_LATE_RULE, Lookup lineage reference object : shbgrul")
    private String subLateRule;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Shrscom withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
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

    public Shrscom withDueDate(Date dueDate) {
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

    public Shrscom withPassInd(String passInd) {
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

    public Shrscom withDescription(String description) {
        this.description = description;
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

    public Shrscom withWeight(Double weight) {
        this.weight = weight;
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

    public Shrscom withAnonymousInd(String anonymousInd) {
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

    public Shrscom withTotalScore(Double totalScore) {
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

    public Shrscom withGschName(String gschName) {
        this.gschName = gschName;
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

    public Shrscom withMinPassScore(Double minPassScore) {
        this.minPassScore = minPassScore;
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

    public Shrscom withSubResitRule(String subResitRule) {
        this.subResitRule = subResitRule;
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

    public Shrscom withName(String name) {
        this.name = name;
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

    public Shrscom withSubSet(String subSet) {
        this.subSet = subSet;
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

    public Shrscom withSubLateRule(String subLateRule) {
        this.subLateRule = subLateRule;
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

    public Shrscom withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrscom.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
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
        sb.append("gschName");
        sb.append('=');
        sb.append(((this.gschName == null)?"<null>":this.gschName));
        sb.append(',');
        sb.append("minPassScore");
        sb.append('=');
        sb.append(((this.minPassScore == null)?"<null>":this.minPassScore));
        sb.append(',');
        sb.append("subResitRule");
        sb.append('=');
        sb.append(((this.subResitRule == null)?"<null>":this.subResitRule));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("subSet");
        sb.append('=');
        sb.append(((this.subSet == null)?"<null>":this.subSet));
        sb.append(',');
        sb.append("subLateRule");
        sb.append('=');
        sb.append(((this.subLateRule == null)?"<null>":this.subLateRule));
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
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.passInd == null)? 0 :this.passInd.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.anonymousInd == null)? 0 :this.anonymousInd.hashCode()));
        result = ((result* 31)+((this.totalScore == null)? 0 :this.totalScore.hashCode()));
        result = ((result* 31)+((this.gschName == null)? 0 :this.gschName.hashCode()));
        result = ((result* 31)+((this.minPassScore == null)? 0 :this.minPassScore.hashCode()));
        result = ((result* 31)+((this.subResitRule == null)? 0 :this.subResitRule.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.subSet == null)? 0 :this.subSet.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subLateRule == null)? 0 :this.subLateRule.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrscom) == false) {
            return false;
        }
        Shrscom rhs = ((Shrscom) other);
        return (((((((((((((((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo)))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.anonymousInd == rhs.anonymousInd)||((this.anonymousInd!= null)&&this.anonymousInd.equals(rhs.anonymousInd))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.gschName == rhs.gschName)||((this.gschName!= null)&&this.gschName.equals(rhs.gschName))))&&((this.minPassScore == rhs.minPassScore)||((this.minPassScore!= null)&&this.minPassScore.equals(rhs.minPassScore))))&&((this.subResitRule == rhs.subResitRule)||((this.subResitRule!= null)&&this.subResitRule.equals(rhs.subResitRule))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.subSet == rhs.subSet)||((this.subSet!= null)&&this.subSet.equals(rhs.subSet))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subLateRule == rhs.subLateRule)||((this.subLateRule!= null)&&this.subLateRule.equals(rhs.subLateRule))));
    }

}
