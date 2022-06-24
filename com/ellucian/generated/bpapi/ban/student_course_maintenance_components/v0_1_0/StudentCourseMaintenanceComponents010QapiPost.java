
package com.ellucian.generated.bpapi.ban.student_course_maintenance_components.v0_1_0;

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
    "id",
    "keyblckTermCode",
    "keyblckValidationCheck",
    "name",
    "totalScore",
    "weight",
    "passInd",
    "shrmrksComments"
})
@Generated("jsonschema2pojo")
public class StudentCourseMaintenanceComponents010QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    @JsonProperty("keyblckValidationCheck")
    private String keyblckValidationCheck;
    @JsonProperty("name")
    private String name;
    @JsonProperty("totalScore")
    private String totalScore;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("passInd")
    private String passInd;
    @JsonProperty("shrmrksComments")
    private String shrmrksComments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentCourseMaintenanceComponents010QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public StudentCourseMaintenanceComponents010QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    @JsonProperty("keyblckValidationCheck")
    public String getKeyblckValidationCheck() {
        return keyblckValidationCheck;
    }

    @JsonProperty("keyblckValidationCheck")
    public void setKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
    }

    public StudentCourseMaintenanceComponents010QapiPost withKeyblckValidationCheck(String keyblckValidationCheck) {
        this.keyblckValidationCheck = keyblckValidationCheck;
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

    public StudentCourseMaintenanceComponents010QapiPost withName(String name) {
        this.name = name;
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

    public StudentCourseMaintenanceComponents010QapiPost withTotalScore(String totalScore) {
        this.totalScore = totalScore;
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

    public StudentCourseMaintenanceComponents010QapiPost withWeight(String weight) {
        this.weight = weight;
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

    public StudentCourseMaintenanceComponents010QapiPost withPassInd(String passInd) {
        this.passInd = passInd;
        return this;
    }

    @JsonProperty("shrmrksComments")
    public String getShrmrksComments() {
        return shrmrksComments;
    }

    @JsonProperty("shrmrksComments")
    public void setShrmrksComments(String shrmrksComments) {
        this.shrmrksComments = shrmrksComments;
    }

    public StudentCourseMaintenanceComponents010QapiPost withShrmrksComments(String shrmrksComments) {
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

    public StudentCourseMaintenanceComponents010QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseMaintenanceComponents010QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("keyblckValidationCheck");
        sb.append('=');
        sb.append(((this.keyblckValidationCheck == null)?"<null>":this.keyblckValidationCheck));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("totalScore");
        sb.append('=');
        sb.append(((this.totalScore == null)?"<null>":this.totalScore));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("passInd");
        sb.append('=');
        sb.append(((this.passInd == null)?"<null>":this.passInd));
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
        if ((other instanceof StudentCourseMaintenanceComponents010QapiPost) == false) {
            return false;
        }
        StudentCourseMaintenanceComponents010QapiPost rhs = ((StudentCourseMaintenanceComponents010QapiPost) other);
        return ((((((((((this.keyblckValidationCheck == rhs.keyblckValidationCheck)||((this.keyblckValidationCheck!= null)&&this.keyblckValidationCheck.equals(rhs.keyblckValidationCheck)))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.totalScore == rhs.totalScore)||((this.totalScore!= null)&&this.totalScore.equals(rhs.totalScore))))&&((this.shrmrksComments == rhs.shrmrksComments)||((this.shrmrksComments!= null)&&this.shrmrksComments.equals(rhs.shrmrksComments))));
    }

}
