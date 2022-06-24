
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
    "criteria.totalScore",
    "keyblckValidationCheck",
    "criteria.shrmrksComments",
    "shrmrksScore",
    "keyblckTermCode",
    "id",
    "criteria.name",
    "criteria.weight",
    "shrmrksGchgCode",
    "shrmrksComments",
    "criteria.passInd",
    "shrmrksGrdeCode"
})
@Generated("jsonschema2pojo")
public class StudentCourseMaintenanceComponents010PutRequest {

    /**
     * Out of
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * 
     */
    @JsonProperty("criteria.totalScore")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_TOTAL_SCORE")
    private Double criteriaTotalScore;
    /**
     * Validation Check
     * <p>
     * Lineage reference object : keyblckValidationCheck
     * 
     */
    @JsonProperty("keyblckValidationCheck")
    @JsonPropertyDescription("Lineage reference object : keyblckValidationCheck")
    private String keyblckValidationCheck;
    /**
     * Lookup lineage reference object : gtvsdax
     * 
     */
    @JsonProperty("criteria.shrmrksComments")
    @JsonPropertyDescription("Lookup lineage reference object : gtvsdax")
    private String criteriaShrmrksComments;
    /**
     * Score
     * <p>
     * 
     * 
     */
    @JsonProperty("shrmrksScore")
    private Double shrmrksScore;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private String keyblckTermCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Component Grade
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * 
     */
    @JsonProperty("criteria.name")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_NAME")
    private String criteriaName;
    /**
     * Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * 
     */
    @JsonProperty("criteria.weight")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_WEIGHT")
    private Double criteriaWeight;
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
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("criteria.passInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_PASS_IND")
    private String criteriaPassInd;
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
     * Out of
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * 
     */
    @JsonProperty("criteria.totalScore")
    public Double getCriteriaTotalScore() {
        return criteriaTotalScore;
    }

    /**
     * Out of
     * <p>
     * Lineage reference object : SHRGCOM_TOTAL_SCORE
     * 
     */
    @JsonProperty("criteria.totalScore")
    public void setCriteriaTotalScore(Double criteriaTotalScore) {
        this.criteriaTotalScore = criteriaTotalScore;
    }

    public StudentCourseMaintenanceComponents010PutRequest withCriteriaTotalScore(Double criteriaTotalScore) {
        this.criteriaTotalScore = criteriaTotalScore;
        return this;
    }

    /**
     * Validation Check
     * <p>
     * Lineage reference object : keyblckValidationCheck
     * 
     */
    @JsonProperty("keyblckValidationCheck")
    public String getKeyblckValidationCheck() {
        return keyblckValidationCheck;
    }

    /**
     * Validation Check
     * <p>
     * Lineage reference object : keyblckValidationCheck
     * 
     */
    @JsonProperty("keyblckValidationCheck")
    public void setKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
    }

    public StudentCourseMaintenanceComponents010PutRequest withKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
        return this;
    }

    /**
     * Lookup lineage reference object : gtvsdax
     * 
     */
    @JsonProperty("criteria.shrmrksComments")
    public String getCriteriaShrmrksComments() {
        return criteriaShrmrksComments;
    }

    /**
     * Lookup lineage reference object : gtvsdax
     * 
     */
    @JsonProperty("criteria.shrmrksComments")
    public void setCriteriaShrmrksComments(String criteriaShrmrksComments) {
        this.criteriaShrmrksComments = criteriaShrmrksComments;
    }

    public StudentCourseMaintenanceComponents010PutRequest withCriteriaShrmrksComments(String criteriaShrmrksComments) {
        this.criteriaShrmrksComments = criteriaShrmrksComments;
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

    public StudentCourseMaintenanceComponents010PutRequest withShrmrksScore(Double shrmrksScore) {
        this.shrmrksScore = shrmrksScore;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public StudentCourseMaintenanceComponents010PutRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentCourseMaintenanceComponents010PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Component Grade
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * 
     */
    @JsonProperty("criteria.name")
    public String getCriteriaName() {
        return criteriaName;
    }

    /**
     * Component Grade
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * 
     */
    @JsonProperty("criteria.name")
    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public StudentCourseMaintenanceComponents010PutRequest withCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
        return this;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * 
     */
    @JsonProperty("criteria.weight")
    public Double getCriteriaWeight() {
        return criteriaWeight;
    }

    /**
     * Weight
     * <p>
     * Lineage reference object : SHRGCOM_WEIGHT
     * 
     */
    @JsonProperty("criteria.weight")
    public void setCriteriaWeight(Double criteriaWeight) {
        this.criteriaWeight = criteriaWeight;
    }

    public StudentCourseMaintenanceComponents010PutRequest withCriteriaWeight(Double criteriaWeight) {
        this.criteriaWeight = criteriaWeight;
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

    public StudentCourseMaintenanceComponents010PutRequest withShrmrksGchgCode(String shrmrksGchgCode) {
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

    public StudentCourseMaintenanceComponents010PutRequest withShrmrksComments(String shrmrksComments) {
        this.shrmrksComments = shrmrksComments;
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

    public StudentCourseMaintenanceComponents010PutRequest withCriteriaPassInd(String criteriaPassInd) {
        this.criteriaPassInd = criteriaPassInd;
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

    public StudentCourseMaintenanceComponents010PutRequest withShrmrksGrdeCode(String shrmrksGrdeCode) {
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

    public StudentCourseMaintenanceComponents010PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseMaintenanceComponents010PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTotalScore");
        sb.append('=');
        sb.append(((this.criteriaTotalScore == null)?"<null>":this.criteriaTotalScore));
        sb.append(',');
        sb.append("keyblckValidationCheck");
        sb.append('=');
        sb.append(((this.keyblckValidationCheck == null)?"<null>":this.keyblckValidationCheck));
        sb.append(',');
        sb.append("criteriaShrmrksComments");
        sb.append('=');
        sb.append(((this.criteriaShrmrksComments == null)?"<null>":this.criteriaShrmrksComments));
        sb.append(',');
        sb.append("shrmrksScore");
        sb.append('=');
        sb.append(((this.shrmrksScore == null)?"<null>":this.shrmrksScore));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaName");
        sb.append('=');
        sb.append(((this.criteriaName == null)?"<null>":this.criteriaName));
        sb.append(',');
        sb.append("criteriaWeight");
        sb.append('=');
        sb.append(((this.criteriaWeight == null)?"<null>":this.criteriaWeight));
        sb.append(',');
        sb.append("shrmrksGchgCode");
        sb.append('=');
        sb.append(((this.shrmrksGchgCode == null)?"<null>":this.shrmrksGchgCode));
        sb.append(',');
        sb.append("shrmrksComments");
        sb.append('=');
        sb.append(((this.shrmrksComments == null)?"<null>":this.shrmrksComments));
        sb.append(',');
        sb.append("criteriaPassInd");
        sb.append('=');
        sb.append(((this.criteriaPassInd == null)?"<null>":this.criteriaPassInd));
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
        result = ((result* 31)+((this.criteriaPassInd == null)? 0 :this.criteriaPassInd.hashCode()));
        result = ((result* 31)+((this.keyblckValidationCheck == null)? 0 :this.keyblckValidationCheck.hashCode()));
        result = ((result* 31)+((this.shrmrksScore == null)? 0 :this.shrmrksScore.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaWeight == null)? 0 :this.criteriaWeight.hashCode()));
        result = ((result* 31)+((this.criteriaTotalScore == null)? 0 :this.criteriaTotalScore.hashCode()));
        result = ((result* 31)+((this.criteriaName == null)? 0 :this.criteriaName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrmrksGchgCode == null)? 0 :this.shrmrksGchgCode.hashCode()));
        result = ((result* 31)+((this.criteriaShrmrksComments == null)? 0 :this.criteriaShrmrksComments.hashCode()));
        result = ((result* 31)+((this.shrmrksComments == null)? 0 :this.shrmrksComments.hashCode()));
        result = ((result* 31)+((this.shrmrksGrdeCode == null)? 0 :this.shrmrksGrdeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseMaintenanceComponents010PutRequest) == false) {
            return false;
        }
        StudentCourseMaintenanceComponents010PutRequest rhs = ((StudentCourseMaintenanceComponents010PutRequest) other);
        return ((((((((((((((this.criteriaPassInd == rhs.criteriaPassInd)||((this.criteriaPassInd!= null)&&this.criteriaPassInd.equals(rhs.criteriaPassInd)))&&((this.keyblckValidationCheck == rhs.keyblckValidationCheck)||((this.keyblckValidationCheck!= null)&&this.keyblckValidationCheck.equals(rhs.keyblckValidationCheck))))&&((this.shrmrksScore == rhs.shrmrksScore)||((this.shrmrksScore!= null)&&this.shrmrksScore.equals(rhs.shrmrksScore))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaWeight == rhs.criteriaWeight)||((this.criteriaWeight!= null)&&this.criteriaWeight.equals(rhs.criteriaWeight))))&&((this.criteriaTotalScore == rhs.criteriaTotalScore)||((this.criteriaTotalScore!= null)&&this.criteriaTotalScore.equals(rhs.criteriaTotalScore))))&&((this.criteriaName == rhs.criteriaName)||((this.criteriaName!= null)&&this.criteriaName.equals(rhs.criteriaName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrmrksGchgCode == rhs.shrmrksGchgCode)||((this.shrmrksGchgCode!= null)&&this.shrmrksGchgCode.equals(rhs.shrmrksGchgCode))))&&((this.criteriaShrmrksComments == rhs.criteriaShrmrksComments)||((this.criteriaShrmrksComments!= null)&&this.criteriaShrmrksComments.equals(rhs.criteriaShrmrksComments))))&&((this.shrmrksComments == rhs.shrmrksComments)||((this.shrmrksComments!= null)&&this.shrmrksComments.equals(rhs.shrmrksComments))))&&((this.shrmrksGrdeCode == rhs.shrmrksGrdeCode)||((this.shrmrksGrdeCode!= null)&&this.shrmrksGrdeCode.equals(rhs.shrmrksGrdeCode))));
    }

}
