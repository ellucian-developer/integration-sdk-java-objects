
package com.ellucian.generated.bpapi.ban.enrollment_status_control.v1_0_0;

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
    "criteria.estsCode",
    "criteria.stvestsDesc",
    "activityDate",
    "xxxxxxxTermCode",
    "xxxxxxxTermCodeDef",
    "criteria.endDate",
    "criteria.startDate"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatusControl100GetRequest {

    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("criteria.estsCode")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests")
    private String criteriaEstsCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvestsDesc")
    private String criteriaStvestsDesc;
    /**
     * Lineage reference object : SFBESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm")
    private Object xxxxxxxTermCode;
    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm")
    private Object xxxxxxxTermCodeDef;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_END_DATE")
    private Date criteriaEndDate;
    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_START_DATE")
    private Date criteriaStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("criteria.estsCode")
    public String getCriteriaEstsCode() {
        return criteriaEstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("criteria.estsCode")
    public void setCriteriaEstsCode(String criteriaEstsCode) {
        this.criteriaEstsCode = criteriaEstsCode;
    }

    public EnrollmentStatusControl100GetRequest withCriteriaEstsCode(String criteriaEstsCode) {
        this.criteriaEstsCode = criteriaEstsCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvestsDesc")
    public String getCriteriaStvestsDesc() {
        return criteriaStvestsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvestsDesc")
    public void setCriteriaStvestsDesc(String criteriaStvestsDesc) {
        this.criteriaStvestsDesc = criteriaStvestsDesc;
    }

    public EnrollmentStatusControl100GetRequest withCriteriaStvestsDesc(String criteriaStvestsDesc) {
        this.criteriaStvestsDesc = criteriaStvestsDesc;
        return this;
    }

    /**
     * Lineage reference object : SFBESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SFBESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EnrollmentStatusControl100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public Object getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public EnrollmentStatusControl100GetRequest withXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
        return this;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    public Object getXxxxxxxTermCodeDef() {
        return xxxxxxxTermCodeDef;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    public void setXxxxxxxTermCodeDef(Object xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
    }

    public EnrollmentStatusControl100GetRequest withXxxxxxxTermCodeDef(Object xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public EnrollmentStatusControl100GetRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public Date getCriteriaStartDate() {
        return criteriaStartDate;
    }

    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public EnrollmentStatusControl100GetRequest withCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
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

    public EnrollmentStatusControl100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatusControl100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaEstsCode");
        sb.append('=');
        sb.append(((this.criteriaEstsCode == null)?"<null>":this.criteriaEstsCode));
        sb.append(',');
        sb.append("criteriaStvestsDesc");
        sb.append('=');
        sb.append(((this.criteriaStvestsDesc == null)?"<null>":this.criteriaStvestsDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
        sb.append(',');
        sb.append("xxxxxxxTermCodeDef");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCodeDef == null)?"<null>":this.xxxxxxxTermCodeDef));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaStvestsDesc == null)? 0 :this.criteriaStvestsDesc.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
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
        if ((other instanceof EnrollmentStatusControl100GetRequest) == false) {
            return false;
        }
        EnrollmentStatusControl100GetRequest rhs = ((EnrollmentStatusControl100GetRequest) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate))))&&((this.criteriaStvestsDesc == rhs.criteriaStvestsDesc)||((this.criteriaStvestsDesc!= null)&&this.criteriaStvestsDesc.equals(rhs.criteriaStvestsDesc))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))))&&((this.xxxxxxxTermCodeDef == rhs.xxxxxxxTermCodeDef)||((this.xxxxxxxTermCodeDef!= null)&&this.xxxxxxxTermCodeDef.equals(rhs.xxxxxxxTermCodeDef))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaEstsCode == rhs.criteriaEstsCode)||((this.criteriaEstsCode!= null)&&this.criteriaEstsCode.equals(rhs.criteriaEstsCode))));
    }

}
