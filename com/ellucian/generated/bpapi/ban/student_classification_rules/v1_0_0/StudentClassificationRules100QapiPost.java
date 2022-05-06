
package com.ellucian.generated.bpapi.ban.student_classification_rules.v1_0_0;

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
    "clasCode",
    "levlCode",
    "fromHours",
    "toHours",
    "stvclasDesc",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class StudentClassificationRules100QapiPost {

    @JsonProperty("clasCode")
    private String clasCode;
    @JsonProperty("levlCode")
    private String levlCode;
    @JsonProperty("fromHours")
    private String fromHours;
    @JsonProperty("toHours")
    private String toHours;
    @JsonProperty("stvclasDesc")
    private String stvclasDesc;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clasCode")
    public String getClasCode() {
        return clasCode;
    }

    @JsonProperty("clasCode")
    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public StudentClassificationRules100QapiPost withClasCode(String clasCode) {
        this.clasCode = clasCode;
        return this;
    }

    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public StudentClassificationRules100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    @JsonProperty("fromHours")
    public String getFromHours() {
        return fromHours;
    }

    @JsonProperty("fromHours")
    public void setFromHours(String fromHours) {
        this.fromHours = fromHours;
    }

    public StudentClassificationRules100QapiPost withFromHours(String fromHours) {
        this.fromHours = fromHours;
        return this;
    }

    @JsonProperty("toHours")
    public String getToHours() {
        return toHours;
    }

    @JsonProperty("toHours")
    public void setToHours(String toHours) {
        this.toHours = toHours;
    }

    public StudentClassificationRules100QapiPost withToHours(String toHours) {
        this.toHours = toHours;
        return this;
    }

    @JsonProperty("stvclasDesc")
    public String getStvclasDesc() {
        return stvclasDesc;
    }

    @JsonProperty("stvclasDesc")
    public void setStvclasDesc(String stvclasDesc) {
        this.stvclasDesc = stvclasDesc;
    }

    public StudentClassificationRules100QapiPost withStvclasDesc(String stvclasDesc) {
        this.stvclasDesc = stvclasDesc;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public StudentClassificationRules100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
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

    public StudentClassificationRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentClassificationRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("fromHours");
        sb.append('=');
        sb.append(((this.fromHours == null)?"<null>":this.fromHours));
        sb.append(',');
        sb.append("toHours");
        sb.append('=');
        sb.append(((this.toHours == null)?"<null>":this.toHours));
        sb.append(',');
        sb.append("stvclasDesc");
        sb.append('=');
        sb.append(((this.stvclasDesc == null)?"<null>":this.stvclasDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.toHours == null)? 0 :this.toHours.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fromHours == null)? 0 :this.fromHours.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.stvclasDesc == null)? 0 :this.stvclasDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentClassificationRules100QapiPost) == false) {
            return false;
        }
        StudentClassificationRules100QapiPost rhs = ((StudentClassificationRules100QapiPost) other);
        return ((((((((this.toHours == rhs.toHours)||((this.toHours!= null)&&this.toHours.equals(rhs.toHours)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fromHours == rhs.fromHours)||((this.fromHours!= null)&&this.fromHours.equals(rhs.fromHours))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.stvclasDesc == rhs.stvclasDesc)||((this.stvclasDesc!= null)&&this.stvclasDesc.equals(rhs.stvclasDesc))));
    }

}
