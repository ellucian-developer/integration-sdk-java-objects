
package com.ellucian.generated.bpapi.ban.enrollment_status_control.v1_0_0;

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
    "xxxxxxxTermCode",
    "xxxxxxxTermCodeDef",
    "criteria.estsCode",
    "criteria.stvestsDesc",
    "criteria.startDate",
    "criteria.endDate",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatusControl100QapiPost {

    @JsonProperty("xxxxxxxTermCode")
    private String xxxxxxxTermCode;
    @JsonProperty("xxxxxxxTermCodeDef")
    private String xxxxxxxTermCodeDef;
    @JsonProperty("criteria.estsCode")
    private String criteriaEstsCode;
    @JsonProperty("criteria.stvestsDesc")
    private String criteriaStvestsDesc;
    @JsonProperty("criteria.startDate")
    private String criteriaStartDate;
    @JsonProperty("criteria.endDate")
    private String criteriaEndDate;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("xxxxxxxTermCode")
    public String getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public EnrollmentStatusControl100QapiPost withXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
        return this;
    }

    @JsonProperty("xxxxxxxTermCodeDef")
    public String getXxxxxxxTermCodeDef() {
        return xxxxxxxTermCodeDef;
    }

    @JsonProperty("xxxxxxxTermCodeDef")
    public void setXxxxxxxTermCodeDef(String xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
    }

    public EnrollmentStatusControl100QapiPost withXxxxxxxTermCodeDef(String xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
        return this;
    }

    @JsonProperty("criteria.estsCode")
    public String getCriteriaEstsCode() {
        return criteriaEstsCode;
    }

    @JsonProperty("criteria.estsCode")
    public void setCriteriaEstsCode(String criteriaEstsCode) {
        this.criteriaEstsCode = criteriaEstsCode;
    }

    public EnrollmentStatusControl100QapiPost withCriteriaEstsCode(String criteriaEstsCode) {
        this.criteriaEstsCode = criteriaEstsCode;
        return this;
    }

    @JsonProperty("criteria.stvestsDesc")
    public String getCriteriaStvestsDesc() {
        return criteriaStvestsDesc;
    }

    @JsonProperty("criteria.stvestsDesc")
    public void setCriteriaStvestsDesc(String criteriaStvestsDesc) {
        this.criteriaStvestsDesc = criteriaStvestsDesc;
    }

    public EnrollmentStatusControl100QapiPost withCriteriaStvestsDesc(String criteriaStvestsDesc) {
        this.criteriaStvestsDesc = criteriaStvestsDesc;
        return this;
    }

    @JsonProperty("criteria.startDate")
    public String getCriteriaStartDate() {
        return criteriaStartDate;
    }

    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(String criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public EnrollmentStatusControl100QapiPost withCriteriaStartDate(String criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
        return this;
    }

    @JsonProperty("criteria.endDate")
    public String getCriteriaEndDate() {
        return criteriaEndDate;
    }

    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(String criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public EnrollmentStatusControl100QapiPost withCriteriaEndDate(String criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
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

    public EnrollmentStatusControl100QapiPost withActivityDate(String activityDate) {
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

    public EnrollmentStatusControl100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatusControl100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
        sb.append(',');
        sb.append("xxxxxxxTermCodeDef");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCodeDef == null)?"<null>":this.xxxxxxxTermCodeDef));
        sb.append(',');
        sb.append("criteriaEstsCode");
        sb.append('=');
        sb.append(((this.criteriaEstsCode == null)?"<null>":this.criteriaEstsCode));
        sb.append(',');
        sb.append("criteriaStvestsDesc");
        sb.append('=');
        sb.append(((this.criteriaStvestsDesc == null)?"<null>":this.criteriaStvestsDesc));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
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
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvestsDesc == null)? 0 :this.criteriaStvestsDesc.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCodeDef == null)? 0 :this.xxxxxxxTermCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaEstsCode == null)? 0 :this.criteriaEstsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentStatusControl100QapiPost) == false) {
            return false;
        }
        EnrollmentStatusControl100QapiPost rhs = ((EnrollmentStatusControl100QapiPost) other);
        return (((((((((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))))&&((this.criteriaStvestsDesc == rhs.criteriaStvestsDesc)||((this.criteriaStvestsDesc!= null)&&this.criteriaStvestsDesc.equals(rhs.criteriaStvestsDesc))))&&((this.xxxxxxxTermCodeDef == rhs.xxxxxxxTermCodeDef)||((this.xxxxxxxTermCodeDef!= null)&&this.xxxxxxxTermCodeDef.equals(rhs.xxxxxxxTermCodeDef))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaEstsCode == rhs.criteriaEstsCode)||((this.criteriaEstsCode!= null)&&this.criteriaEstsCode.equals(rhs.criteriaEstsCode))));
    }

}
