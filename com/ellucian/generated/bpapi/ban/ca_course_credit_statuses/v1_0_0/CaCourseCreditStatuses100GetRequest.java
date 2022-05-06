
package com.ellucian.generated.bpapi.ban.ca_course_credit_statuses.v1_0_0;

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
    "degreeAppl",
    "creditCourse",
    "activityDate",
    "creditStatus",
    "desc"
})
@Generated("jsonschema2pojo")
public class CaCourseCreditStatuses100GetRequest {

    /**
     * Lineage reference object : SVVCCST_DEGREE_APPL
     * 
     */
    @JsonProperty("degreeAppl")
    @JsonPropertyDescription("Lineage reference object : SVVCCST_DEGREE_APPL")
    private String degreeAppl;
    /**
     * Lineage reference object : SVVCCST_CREDIT_COURSE
     * 
     */
    @JsonProperty("creditCourse")
    @JsonPropertyDescription("Lineage reference object : SVVCCST_CREDIT_COURSE")
    private String creditCourse;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVCCST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVVCCST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : SVVCCST_CREDIT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("creditStatus")
    @JsonPropertyDescription("Lineage reference object : SVVCCST_CREDIT_STATUS")
    private String creditStatus;
    /**
     * Description
     * <p>
     * Lineage reference object : SVVCCST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SVVCCST_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SVVCCST_DEGREE_APPL
     * 
     */
    @JsonProperty("degreeAppl")
    public String getDegreeAppl() {
        return degreeAppl;
    }

    /**
     * Lineage reference object : SVVCCST_DEGREE_APPL
     * 
     */
    @JsonProperty("degreeAppl")
    public void setDegreeAppl(String degreeAppl) {
        this.degreeAppl = degreeAppl;
    }

    public CaCourseCreditStatuses100GetRequest withDegreeAppl(String degreeAppl) {
        this.degreeAppl = degreeAppl;
        return this;
    }

    /**
     * Lineage reference object : SVVCCST_CREDIT_COURSE
     * 
     */
    @JsonProperty("creditCourse")
    public String getCreditCourse() {
        return creditCourse;
    }

    /**
     * Lineage reference object : SVVCCST_CREDIT_COURSE
     * 
     */
    @JsonProperty("creditCourse")
    public void setCreditCourse(String creditCourse) {
        this.creditCourse = creditCourse;
    }

    public CaCourseCreditStatuses100GetRequest withCreditCourse(String creditCourse) {
        this.creditCourse = creditCourse;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVCCST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVCCST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaCourseCreditStatuses100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVCCST_CREDIT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("creditStatus")
    public String getCreditStatus() {
        return creditStatus;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVCCST_CREDIT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("creditStatus")
    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public CaCourseCreditStatuses100GetRequest withCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVCCST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVCCST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaCourseCreditStatuses100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public CaCourseCreditStatuses100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaCourseCreditStatuses100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("degreeAppl");
        sb.append('=');
        sb.append(((this.degreeAppl == null)?"<null>":this.degreeAppl));
        sb.append(',');
        sb.append("creditCourse");
        sb.append('=');
        sb.append(((this.creditCourse == null)?"<null>":this.creditCourse));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("creditStatus");
        sb.append('=');
        sb.append(((this.creditStatus == null)?"<null>":this.creditStatus));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.degreeAppl == null)? 0 :this.degreeAppl.hashCode()));
        result = ((result* 31)+((this.creditCourse == null)? 0 :this.creditCourse.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.creditStatus == null)? 0 :this.creditStatus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaCourseCreditStatuses100GetRequest) == false) {
            return false;
        }
        CaCourseCreditStatuses100GetRequest rhs = ((CaCourseCreditStatuses100GetRequest) other);
        return (((((((this.degreeAppl == rhs.degreeAppl)||((this.degreeAppl!= null)&&this.degreeAppl.equals(rhs.degreeAppl)))&&((this.creditCourse == rhs.creditCourse)||((this.creditCourse!= null)&&this.creditCourse.equals(rhs.creditCourse))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.creditStatus == rhs.creditStatus)||((this.creditStatus!= null)&&this.creditStatus.equals(rhs.creditStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
