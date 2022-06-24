
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
    "keyblckValidationCheck",
    "passInd",
    "keyblckTermCode",
    "name",
    "weight",
    "id",
    "totalScore",
    "shrmrksComments"
})
@Generated("jsonschema2pojo")
public class StudentCourseMaintenanceComponents010GetRequest {

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
     * Lineage reference object : SHRGCOM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_PASS_IND")
    private String passInd;
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
     * Component Grade
     * <p>
     * Lineage reference object : SHRGCOM_NAME
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SHRGCOM_NAME")
    private String name;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
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
     * Lookup lineage reference object : gtvsdax
     * 
     */
    @JsonProperty("shrmrksComments")
    @JsonPropertyDescription("Lookup lineage reference object : gtvsdax")
    private String shrmrksComments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public StudentCourseMaintenanceComponents010GetRequest withKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
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

    public StudentCourseMaintenanceComponents010GetRequest withPassInd(String passInd) {
        this.passInd = passInd;
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

    public StudentCourseMaintenanceComponents010GetRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
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

    public StudentCourseMaintenanceComponents010GetRequest withName(String name) {
        this.name = name;
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

    public StudentCourseMaintenanceComponents010GetRequest withWeight(Double weight) {
        this.weight = weight;
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

    public StudentCourseMaintenanceComponents010GetRequest withId(String id) {
        this.id = id;
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

    public StudentCourseMaintenanceComponents010GetRequest withTotalScore(Double totalScore) {
        this.totalScore = totalScore;
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

    public StudentCourseMaintenanceComponents010GetRequest withShrmrksComments(String shrmrksComments) {
        this.shrmrksComments = shrmrksComments;
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

    public StudentCourseMaintenanceComponents010GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseMaintenanceComponents010GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckValidationCheck");
        sb.append('=');
        sb.append(((this.keyblckValidationCheck == null)?"<null>":this.keyblckValidationCheck));
        sb.append(',');
        sb.append("passInd");
        sb.append('=');
        sb.append(((this.passInd == null)?"<null>":this.passInd));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("totalScore");
        sb.append('=');
        sb.append(((this.totalScore == null)?"<null>":this.totalScore));
        sb.append(',');
        sb.append("shrmrksComments");
        sb.append('=');
        sb.append(((this.shrmrksComments == null)?"<null>":this.shrmrksComments));
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
        result = ((result* 31)+((this.keyblckValidationCheck == null)? 0 :this.keyblckValidationCheck.hashCode()));
        result = ((result* 31)+((this.passInd == null)? 0 :this.passInd.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.totalScore == null)? 0 :this.totalScore.hashCode()));
        result = ((result* 31)+((this.shrmrksComments == null)? 0 :this.shrmrksComments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseMaintenanceComponents010GetRequest) == false) {
            return false;
        }
        StudentCourseMaintenanceComponents010GetRequest rhs = ((StudentCourseMaintenanceComponents010GetRequest) other);
        return ((((((((((this.keyblckValidationCheck == rhs.keyblckValidationCheck)||((this.keyblckValidationCheck!= null)&&this.keyblckValidationCheck.equals(rhs.keyblckValidationCheck)))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.shrmrksComments == rhs.shrmrksComments)||((this.shrmrksComments!= null)&&this.shrmrksComments.equals(rhs.shrmrksComments))));
    }

}
