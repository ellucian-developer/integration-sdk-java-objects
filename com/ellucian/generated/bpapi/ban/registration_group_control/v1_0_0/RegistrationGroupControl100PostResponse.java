
package com.ellucian.generated.bpapi.ban.registration_group_control.v1_0_0;

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
    "activityDate",
    "studentCnt",
    "rgrpCode",
    "priority"
})
@Generated("jsonschema2pojo")
public class RegistrationGroupControl100PostResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFBWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFBWCTL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Group Count
     * <p>
     * 
     * 
     */
    @JsonProperty("studentCnt")
    private Double studentCnt;
    /**
     * Group Code
     * <p>
     * Lineage reference object : SFBWCTL_RGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("rgrpCode")
    @JsonPropertyDescription("Lineage reference object : SFBWCTL_RGRP_CODE")
    private String rgrpCode;
    /**
     * Group Priority
     * <p>
     * Lineage reference object : SFBWCTL_PRIORITY, Lookup lineage reference object : sfrwctl
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : SFBWCTL_PRIORITY, Lookup lineage reference object : sfrwctl")
    private Double priority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFBWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFBWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RegistrationGroupControl100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Group Count
     * <p>
     * 
     * 
     */
    @JsonProperty("studentCnt")
    public Double getStudentCnt() {
        return studentCnt;
    }

    /**
     * Group Count
     * <p>
     * 
     * 
     */
    @JsonProperty("studentCnt")
    public void setStudentCnt(Double studentCnt) {
        this.studentCnt = studentCnt;
    }

    public RegistrationGroupControl100PostResponse withStudentCnt(Double studentCnt) {
        this.studentCnt = studentCnt;
        return this;
    }

    /**
     * Group Code
     * <p>
     * Lineage reference object : SFBWCTL_RGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("rgrpCode")
    public String getRgrpCode() {
        return rgrpCode;
    }

    /**
     * Group Code
     * <p>
     * Lineage reference object : SFBWCTL_RGRP_CODE
     * (Required)
     * 
     */
    @JsonProperty("rgrpCode")
    public void setRgrpCode(String rgrpCode) {
        this.rgrpCode = rgrpCode;
    }

    public RegistrationGroupControl100PostResponse withRgrpCode(String rgrpCode) {
        this.rgrpCode = rgrpCode;
        return this;
    }

    /**
     * Group Priority
     * <p>
     * Lineage reference object : SFBWCTL_PRIORITY, Lookup lineage reference object : sfrwctl
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Group Priority
     * <p>
     * Lineage reference object : SFBWCTL_PRIORITY, Lookup lineage reference object : sfrwctl
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public RegistrationGroupControl100PostResponse withPriority(Double priority) {
        this.priority = priority;
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

    public RegistrationGroupControl100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationGroupControl100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("studentCnt");
        sb.append('=');
        sb.append(((this.studentCnt == null)?"<null>":this.studentCnt));
        sb.append(',');
        sb.append("rgrpCode");
        sb.append('=');
        sb.append(((this.rgrpCode == null)?"<null>":this.rgrpCode));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        result = ((result* 31)+((this.studentCnt == null)? 0 :this.studentCnt.hashCode()));
        result = ((result* 31)+((this.rgrpCode == null)? 0 :this.rgrpCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationGroupControl100PostResponse) == false) {
            return false;
        }
        RegistrationGroupControl100PostResponse rhs = ((RegistrationGroupControl100PostResponse) other);
        return ((((((this.studentCnt == rhs.studentCnt)||((this.studentCnt!= null)&&this.studentCnt.equals(rhs.studentCnt)))&&((this.rgrpCode == rhs.rgrpCode)||((this.rgrpCode!= null)&&this.rgrpCode.equals(rhs.rgrpCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))));
    }

}
