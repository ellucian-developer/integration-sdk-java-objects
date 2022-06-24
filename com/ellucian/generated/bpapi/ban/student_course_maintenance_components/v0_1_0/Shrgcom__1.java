
package com.ellucian.generated.bpapi.ban.student_course_maintenance_components.v0_1_0;

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
    "shrcmrkGchgCodeDesc",
    "shrmrksScore",
    "shrmrksShrgcomDescription",
    "passInd",
    "shrscomShrgcomScore",
    "description",
    "weight",
    "shrscomShrgcomGrdeCode",
    "totalScore",
    "shrmrksPercentage",
    "shrscomShrgcomDescription",
    "shrscomShrgcomPercentage",
    "shrmrksSummary",
    "name",
    "shrscomShrgcomName",
    "shrmrksGchgCode",
    "shrmrksComments",
    "shrmrksShrgcomName",
    "shrmrksGrdeCode"
})
@Generated("jsonschema2pojo")
public class Shrgcom__1 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("shrcmrkGchgCodeDesc")
    private String shrcmrkGchgCodeDesc;
    /**
     * Score
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksScore")
    private Double shrmrksScore;
    @JsonProperty("shrmrksShrgcomDescription")
    private String shrmrksShrgcomDescription;
    /**
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_PASS_IND")
    private String passInd;
    /**
     * Score
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomScore")
    private Double shrscomShrgcomScore;
    /**
     * Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_DESCRIPTION")
    private String description;
    /**
     * Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_WEIGHT")
    private Double weight;
    /**
     * Letter Grade
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomGrdeCode")
    private String shrscomShrgcomGrdeCode;
    /**
     * Out of
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * 
     */
    @JsonProperty("totalScore")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_TOTAL_SCORE")
    private Double totalScore;
    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksPercentage")
    private Double shrmrksPercentage;
    @JsonProperty("shrscomShrgcomDescription")
    private String shrscomShrgcomDescription;
    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomPercentage")
    private Double shrscomShrgcomPercentage;
    /**
     * Calculated Summary
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksSummary")
    private String shrmrksSummary;
    /**
     * Component Grade
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_NAME")
    private String name;
    /**
     * Component
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomName")
    private String shrscomShrgcomName;
    /**
     * Change  Reason
     * <p>
     * Lookup lineage reference object : stvgchg
     * (Required)
     * 
     */
    @JsonProperty("shrmrksGchgCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvgchg")
    private String shrmrksGchgCode;
    /**
     * Lookup lineage reference object : gtvsdax
     * 
     */
    @JsonProperty("shrmrksComments")
    @JsonPropertyDescription("Lookup lineage reference object : gtvsdax")
    private String shrmrksComments;
    /**
     * Component
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksShrgcomName")
    private String shrmrksShrgcomName;
    /**
     * Letter Grade
     * <p>
     * Lookup lineage reference object : shrgrde
     * 
     */
    @JsonProperty("shrmrksGrdeCode")
    @JsonPropertyDescription("Lookup lineage reference object : shrgrde")
    private String shrmrksGrdeCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("shrcmrkGchgCodeDesc")
    public String getShrcmrkGchgCodeDesc() {
        return shrcmrkGchgCodeDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("shrcmrkGchgCodeDesc")
    public void setShrcmrkGchgCodeDesc(String shrcmrkGchgCodeDesc) {
        this.shrcmrkGchgCodeDesc = shrcmrkGchgCodeDesc;
    }

    public Shrgcom__1 withShrcmrkGchgCodeDesc(String shrcmrkGchgCodeDesc) {
        this.shrcmrkGchgCodeDesc = shrcmrkGchgCodeDesc;
        return this;
    }

    /**
     * Score
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksScore")
    public Double getShrmrksScore() {
        return shrmrksScore;
    }

    /**
     * Score
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksScore")
    public void setShrmrksScore(Double shrmrksScore) {
        this.shrmrksScore = shrmrksScore;
    }

    public Shrgcom__1 withShrmrksScore(Double shrmrksScore) {
        this.shrmrksScore = shrmrksScore;
        return this;
    }

    @JsonProperty("shrmrksShrgcomDescription")
    public String getShrmrksShrgcomDescription() {
        return shrmrksShrgcomDescription;
    }

    @JsonProperty("shrmrksShrgcomDescription")
    public void setShrmrksShrgcomDescription(String shrmrksShrgcomDescription) {
        this.shrmrksShrgcomDescription = shrmrksShrgcomDescription;
    }

    public Shrgcom__1 withShrmrksShrgcomDescription(String shrmrksShrgcomDescription) {
        this.shrmrksShrgcomDescription = shrmrksShrgcomDescription;
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

    public Shrgcom__1 withPassInd(String passInd) {
        this.passInd = passInd;
        return this;
    }

    /**
     * Score
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomScore")
    public Double getShrscomShrgcomScore() {
        return shrscomShrgcomScore;
    }

    /**
     * Score
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomScore")
    public void setShrscomShrgcomScore(Double shrscomShrgcomScore) {
        this.shrscomShrgcomScore = shrscomShrgcomScore;
    }

    public Shrgcom__1 withShrscomShrgcomScore(Double shrscomShrgcomScore) {
        this.shrscomShrgcomScore = shrscomShrgcomScore;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SHRGCOM_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Shrgcom__1 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * 
     */
    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Shrgcom__1 withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Letter Grade
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomGrdeCode")
    public String getShrscomShrgcomGrdeCode() {
        return shrscomShrgcomGrdeCode;
    }

    /**
     * Letter Grade
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomGrdeCode")
    public void setShrscomShrgcomGrdeCode(String shrscomShrgcomGrdeCode) {
        this.shrscomShrgcomGrdeCode = shrscomShrgcomGrdeCode;
    }

    public Shrgcom__1 withShrscomShrgcomGrdeCode(String shrscomShrgcomGrdeCode) {
        this.shrscomShrgcomGrdeCode = shrscomShrgcomGrdeCode;
        return this;
    }

    /**
     * Out of
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * 
     */
    @JsonProperty("totalScore")
    public Double getTotalScore() {
        return totalScore;
    }

    /**
     * Out of
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * 
     */
    @JsonProperty("totalScore")
    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Shrgcom__1 withTotalScore(Double totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksPercentage")
    public Double getShrmrksPercentage() {
        return shrmrksPercentage;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksPercentage")
    public void setShrmrksPercentage(Double shrmrksPercentage) {
        this.shrmrksPercentage = shrmrksPercentage;
    }

    public Shrgcom__1 withShrmrksPercentage(Double shrmrksPercentage) {
        this.shrmrksPercentage = shrmrksPercentage;
        return this;
    }

    @JsonProperty("shrscomShrgcomDescription")
    public String getShrscomShrgcomDescription() {
        return shrscomShrgcomDescription;
    }

    @JsonProperty("shrscomShrgcomDescription")
    public void setShrscomShrgcomDescription(String shrscomShrgcomDescription) {
        this.shrscomShrgcomDescription = shrscomShrgcomDescription;
    }

    public Shrgcom__1 withShrscomShrgcomDescription(String shrscomShrgcomDescription) {
        this.shrscomShrgcomDescription = shrscomShrgcomDescription;
        return this;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomPercentage")
    public Double getShrscomShrgcomPercentage() {
        return shrscomShrgcomPercentage;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomPercentage")
    public void setShrscomShrgcomPercentage(Double shrscomShrgcomPercentage) {
        this.shrscomShrgcomPercentage = shrscomShrgcomPercentage;
    }

    public Shrgcom__1 withShrscomShrgcomPercentage(Double shrscomShrgcomPercentage) {
        this.shrscomShrgcomPercentage = shrscomShrgcomPercentage;
        return this;
    }

    /**
     * Calculated Summary
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksSummary")
    public String getShrmrksSummary() {
        return shrmrksSummary;
    }

    /**
     * Calculated Summary
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksSummary")
    public void setShrmrksSummary(String shrmrksSummary) {
        this.shrmrksSummary = shrmrksSummary;
    }

    public Shrgcom__1 withShrmrksSummary(String shrmrksSummary) {
        this.shrmrksSummary = shrmrksSummary;
        return this;
    }

    /**
     * Component Grade
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Component Grade
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Shrgcom__1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Component
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomName")
    public String getShrscomShrgcomName() {
        return shrscomShrgcomName;
    }

    /**
     * Component
     * <p>
     * 
     * 
     */
    @JsonProperty("shrscomShrgcomName")
    public void setShrscomShrgcomName(String shrscomShrgcomName) {
        this.shrscomShrgcomName = shrscomShrgcomName;
    }

    public Shrgcom__1 withShrscomShrgcomName(String shrscomShrgcomName) {
        this.shrscomShrgcomName = shrscomShrgcomName;
        return this;
    }

    /**
     * Change  Reason
     * <p>
     * Lookup lineage reference object : stvgchg
     * (Required)
     * 
     */
    @JsonProperty("shrmrksGchgCode")
    public String getShrmrksGchgCode() {
        return shrmrksGchgCode;
    }

    /**
     * Change  Reason
     * <p>
     * Lookup lineage reference object : stvgchg
     * (Required)
     * 
     */
    @JsonProperty("shrmrksGchgCode")
    public void setShrmrksGchgCode(String shrmrksGchgCode) {
        this.shrmrksGchgCode = shrmrksGchgCode;
    }

    public Shrgcom__1 withShrmrksGchgCode(String shrmrksGchgCode) {
        this.shrmrksGchgCode = shrmrksGchgCode;
        return this;
    }

    /**
     * Lookup lineage reference object : gtvsdax
     * 
     */
    @JsonProperty("shrmrksComments")
    public String getShrmrksComments() {
        return shrmrksComments;
    }

    /**
     * Lookup lineage reference object : gtvsdax
     * 
     */
    @JsonProperty("shrmrksComments")
    public void setShrmrksComments(String shrmrksComments) {
        this.shrmrksComments = shrmrksComments;
    }

    public Shrgcom__1 withShrmrksComments(String shrmrksComments) {
        this.shrmrksComments = shrmrksComments;
        return this;
    }

    /**
     * Component
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksShrgcomName")
    public String getShrmrksShrgcomName() {
        return shrmrksShrgcomName;
    }

    /**
     * Component
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksShrgcomName")
    public void setShrmrksShrgcomName(String shrmrksShrgcomName) {
        this.shrmrksShrgcomName = shrmrksShrgcomName;
    }

    public Shrgcom__1 withShrmrksShrgcomName(String shrmrksShrgcomName) {
        this.shrmrksShrgcomName = shrmrksShrgcomName;
        return this;
    }

    /**
     * Letter Grade
     * <p>
     * Lookup lineage reference object : shrgrde
     * 
     */
    @JsonProperty("shrmrksGrdeCode")
    public String getShrmrksGrdeCode() {
        return shrmrksGrdeCode;
    }

    /**
     * Letter Grade
     * <p>
     * Lookup lineage reference object : shrgrde
     * 
     */
    @JsonProperty("shrmrksGrdeCode")
    public void setShrmrksGrdeCode(String shrmrksGrdeCode) {
        this.shrmrksGrdeCode = shrmrksGrdeCode;
    }

    public Shrgcom__1 withShrmrksGrdeCode(String shrmrksGrdeCode) {
        this.shrmrksGrdeCode = shrmrksGrdeCode;
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

    public Shrgcom__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrgcom__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrcmrkGchgCodeDesc");
        sb.append('=');
        sb.append(((this.shrcmrkGchgCodeDesc == null)?"<null>":this.shrcmrkGchgCodeDesc));
        sb.append(',');
        sb.append("shrmrksScore");
        sb.append('=');
        sb.append(((this.shrmrksScore == null)?"<null>":this.shrmrksScore));
        sb.append(',');
        sb.append("shrmrksShrgcomDescription");
        sb.append('=');
        sb.append(((this.shrmrksShrgcomDescription == null)?"<null>":this.shrmrksShrgcomDescription));
        sb.append(',');
        sb.append("passInd");
        sb.append('=');
        sb.append(((this.passInd == null)?"<null>":this.passInd));
        sb.append(',');
        sb.append("shrscomShrgcomScore");
        sb.append('=');
        sb.append(((this.shrscomShrgcomScore == null)?"<null>":this.shrscomShrgcomScore));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("shrscomShrgcomGrdeCode");
        sb.append('=');
        sb.append(((this.shrscomShrgcomGrdeCode == null)?"<null>":this.shrscomShrgcomGrdeCode));
        sb.append(',');
        sb.append("totalScore");
        sb.append('=');
        sb.append(((this.totalScore == null)?"<null>":this.totalScore));
        sb.append(',');
        sb.append("shrmrksPercentage");
        sb.append('=');
        sb.append(((this.shrmrksPercentage == null)?"<null>":this.shrmrksPercentage));
        sb.append(',');
        sb.append("shrscomShrgcomDescription");
        sb.append('=');
        sb.append(((this.shrscomShrgcomDescription == null)?"<null>":this.shrscomShrgcomDescription));
        sb.append(',');
        sb.append("shrscomShrgcomPercentage");
        sb.append('=');
        sb.append(((this.shrscomShrgcomPercentage == null)?"<null>":this.shrscomShrgcomPercentage));
        sb.append(',');
        sb.append("shrmrksSummary");
        sb.append('=');
        sb.append(((this.shrmrksSummary == null)?"<null>":this.shrmrksSummary));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("shrscomShrgcomName");
        sb.append('=');
        sb.append(((this.shrscomShrgcomName == null)?"<null>":this.shrscomShrgcomName));
        sb.append(',');
        sb.append("shrmrksGchgCode");
        sb.append('=');
        sb.append(((this.shrmrksGchgCode == null)?"<null>":this.shrmrksGchgCode));
        sb.append(',');
        sb.append("shrmrksComments");
        sb.append('=');
        sb.append(((this.shrmrksComments == null)?"<null>":this.shrmrksComments));
        sb.append(',');
        sb.append("shrmrksShrgcomName");
        sb.append('=');
        sb.append(((this.shrmrksShrgcomName == null)?"<null>":this.shrmrksShrgcomName));
        sb.append(',');
        sb.append("shrmrksGrdeCode");
        sb.append('=');
        sb.append(((this.shrmrksGrdeCode == null)?"<null>":this.shrmrksGrdeCode));
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
        result = ((result* 31)+((this.shrcmrkGchgCodeDesc == null)? 0 :this.shrcmrkGchgCodeDesc.hashCode()));
        result = ((result* 31)+((this.shrmrksScore == null)? 0 :this.shrmrksScore.hashCode()));
        result = ((result* 31)+((this.shrmrksShrgcomDescription == null)? 0 :this.shrmrksShrgcomDescription.hashCode()));
        result = ((result* 31)+((this.passInd == null)? 0 :this.passInd.hashCode()));
        result = ((result* 31)+((this.shrscomShrgcomScore == null)? 0 :this.shrscomShrgcomScore.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.shrscomShrgcomGrdeCode == null)? 0 :this.shrscomShrgcomGrdeCode.hashCode()));
        result = ((result* 31)+((this.totalScore == null)? 0 :this.totalScore.hashCode()));
        result = ((result* 31)+((this.shrmrksPercentage == null)? 0 :this.shrmrksPercentage.hashCode()));
        result = ((result* 31)+((this.shrscomShrgcomDescription == null)? 0 :this.shrscomShrgcomDescription.hashCode()));
        result = ((result* 31)+((this.shrscomShrgcomPercentage == null)? 0 :this.shrscomShrgcomPercentage.hashCode()));
        result = ((result* 31)+((this.shrmrksSummary == null)? 0 :this.shrmrksSummary.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.shrscomShrgcomName == null)? 0 :this.shrscomShrgcomName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrmrksGchgCode == null)? 0 :this.shrmrksGchgCode.hashCode()));
        result = ((result* 31)+((this.shrmrksComments == null)? 0 :this.shrmrksComments.hashCode()));
        result = ((result* 31)+((this.shrmrksShrgcomName == null)? 0 :this.shrmrksShrgcomName.hashCode()));
        result = ((result* 31)+((this.shrmrksGrdeCode == null)? 0 :this.shrmrksGrdeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrgcom__1) == false) {
            return false;
        }
        Shrgcom__1 rhs = ((Shrgcom__1) other);
        return (((((((((((((((((((((this.shrcmrkGchgCodeDesc == rhs.shrcmrkGchgCodeDesc)||((this.shrcmrkGchgCodeDesc!= null)&&this.shrcmrkGchgCodeDesc.equals(rhs.shrcmrkGchgCodeDesc)))&&((this.shrmrksScore == rhs.shrmrksScore)||((this.shrmrksScore!= null)&&this.shrmrksScore.equals(rhs.shrmrksScore))))&&((this.shrmrksShrgcomDescription == rhs.shrmrksShrgcomDescription)||((this.shrmrksShrgcomDescription!= null)&&this.shrmrksShrgcomDescription.equals(rhs.shrmrksShrgcomDescription))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.shrscomShrgcomScore == rhs.shrscomShrgcomScore)||((this.shrscomShrgcomScore!= null)&&this.shrscomShrgcomScore.equals(rhs.shrscomShrgcomScore))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.shrscomShrgcomGrdeCode == rhs.shrscomShrgcomGrdeCode)||((this.shrscomShrgcomGrdeCode!= null)&&this.shrscomShrgcomGrdeCode.equals(rhs.shrscomShrgcomGrdeCode))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.shrmrksPercentage == rhs.shrmrksPercentage)||((this.shrmrksPercentage!= null)&&this.shrmrksPercentage.equals(rhs.shrmrksPercentage))))&&((this.shrscomShrgcomDescription == rhs.shrscomShrgcomDescription)||((this.shrscomShrgcomDescription!= null)&&this.shrscomShrgcomDescription.equals(rhs.shrscomShrgcomDescription))))&&((this.shrscomShrgcomPercentage == rhs.shrscomShrgcomPercentage)||((this.shrscomShrgcomPercentage!= null)&&this.shrscomShrgcomPercentage.equals(rhs.shrscomShrgcomPercentage))))&&((this.shrmrksSummary == rhs.shrmrksSummary)||((this.shrmrksSummary!= null)&&this.shrmrksSummary.equals(rhs.shrmrksSummary))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.shrscomShrgcomName == rhs.shrscomShrgcomName)||((this.shrscomShrgcomName!= null)&&this.shrscomShrgcomName.equals(rhs.shrscomShrgcomName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrmrksGchgCode == rhs.shrmrksGchgCode)||((this.shrmrksGchgCode!= null)&&this.shrmrksGchgCode.equals(rhs.shrmrksGchgCode))))&&((this.shrmrksComments == rhs.shrmrksComments)||((this.shrmrksComments!= null)&&this.shrmrksComments.equals(rhs.shrmrksComments))))&&((this.shrmrksShrgcomName == rhs.shrmrksShrgcomName)||((this.shrmrksShrgcomName!= null)&&this.shrmrksShrgcomName.equals(rhs.shrmrksShrgcomName))))&&((this.shrmrksGrdeCode == rhs.shrmrksGrdeCode)||((this.shrmrksGrdeCode!= null)&&this.shrmrksGrdeCode.equals(rhs.shrmrksGrdeCode))));
    }

}
