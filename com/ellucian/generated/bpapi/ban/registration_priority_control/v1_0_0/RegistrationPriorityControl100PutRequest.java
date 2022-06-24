
package com.ellucian.generated.bpapi.ban.registration_priority_control.v1_0_0;

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
    "hourEnd",
    "beginDate",
    "criteria.activityDate",
    "criteria.hourBegin",
    "criteria.hourEnd",
    "criteria.priority",
    "endDate",
    "keyblocTermCode",
    "hourBegin",
    "criteria.endDate",
    "priority",
    "criteria.beginDate"
})
@Generated("jsonschema2pojo")
public class RegistrationPriorityControl100PutRequest {

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * (Required)
     * 
     */
    @JsonProperty("hourEnd")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_HOUR_END")
    private String hourEnd;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * (Required)
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_BEGIN_DATE")
    private Date beginDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Start Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.hourBegin")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_HOUR_BEGIN")
    private String criteriaHourBegin;
    /**
     * End Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * (Required)
     * 
     */
    @JsonProperty("criteria.hourEnd")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_HOUR_END")
    private String criteriaHourEnd;
    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_PRIORITY")
    private Double criteriaPriority;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_END_DATE")
    private Date endDate;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Start Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * (Required)
     * 
     */
    @JsonProperty("hourBegin")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_HOUR_BEGIN")
    private String hourBegin;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_END_DATE")
    private Date criteriaEndDate;
    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_PRIORITY")
    private Double priority;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_BEGIN_DATE")
    private Date criteriaBeginDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * (Required)
     * 
     */
    @JsonProperty("hourEnd")
    public String getHourEnd() {
        return hourEnd;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * (Required)
     * 
     */
    @JsonProperty("hourEnd")
    public void setHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
    }

    public RegistrationPriorityControl100PutRequest withHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public RegistrationPriorityControl100PutRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public RegistrationPriorityControl100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.hourBegin")
    public String getCriteriaHourBegin() {
        return criteriaHourBegin;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.hourBegin")
    public void setCriteriaHourBegin(String criteriaHourBegin) {
        this.criteriaHourBegin = criteriaHourBegin;
    }

    public RegistrationPriorityControl100PutRequest withCriteriaHourBegin(String criteriaHourBegin) {
        this.criteriaHourBegin = criteriaHourBegin;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * (Required)
     * 
     */
    @JsonProperty("criteria.hourEnd")
    public String getCriteriaHourEnd() {
        return criteriaHourEnd;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * (Required)
     * 
     */
    @JsonProperty("criteria.hourEnd")
    public void setCriteriaHourEnd(String criteriaHourEnd) {
        this.criteriaHourEnd = criteriaHourEnd;
    }

    public RegistrationPriorityControl100PutRequest withCriteriaHourEnd(String criteriaHourEnd) {
        this.criteriaHourEnd = criteriaHourEnd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    public Double getCriteriaPriority() {
        return criteriaPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.priority")
    public void setCriteriaPriority(Double criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
    }

    public RegistrationPriorityControl100PutRequest withCriteriaPriority(Double criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public RegistrationPriorityControl100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public RegistrationPriorityControl100PutRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * (Required)
     * 
     */
    @JsonProperty("hourBegin")
    public String getHourBegin() {
        return hourBegin;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * (Required)
     * 
     */
    @JsonProperty("hourBegin")
    public void setHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
    }

    public RegistrationPriorityControl100PutRequest withHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
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
     * Lineage reference object : SFRWCTL_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public RegistrationPriorityControl100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public RegistrationPriorityControl100PutRequest withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public Date getCriteriaBeginDate() {
        return criteriaBeginDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public void setCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
    }

    public RegistrationPriorityControl100PutRequest withCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
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

    public RegistrationPriorityControl100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationPriorityControl100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hourEnd");
        sb.append('=');
        sb.append(((this.hourEnd == null)?"<null>":this.hourEnd));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaHourBegin");
        sb.append('=');
        sb.append(((this.criteriaHourBegin == null)?"<null>":this.criteriaHourBegin));
        sb.append(',');
        sb.append("criteriaHourEnd");
        sb.append('=');
        sb.append(((this.criteriaHourEnd == null)?"<null>":this.criteriaHourEnd));
        sb.append(',');
        sb.append("criteriaPriority");
        sb.append('=');
        sb.append(((this.criteriaPriority == null)?"<null>":this.criteriaPriority));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("hourBegin");
        sb.append('=');
        sb.append(((this.hourBegin == null)?"<null>":this.hourBegin));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("criteriaBeginDate");
        sb.append('=');
        sb.append(((this.criteriaBeginDate == null)?"<null>":this.criteriaBeginDate));
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
        result = ((result* 31)+((this.hourEnd == null)? 0 :this.hourEnd.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaHourBegin == null)? 0 :this.criteriaHourBegin.hashCode()));
        result = ((result* 31)+((this.criteriaHourEnd == null)? 0 :this.criteriaHourEnd.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.hourBegin == null)? 0 :this.hourBegin.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.criteriaPriority == null)? 0 :this.criteriaPriority.hashCode()));
        result = ((result* 31)+((this.criteriaBeginDate == null)? 0 :this.criteriaBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationPriorityControl100PutRequest) == false) {
            return false;
        }
        RegistrationPriorityControl100PutRequest rhs = ((RegistrationPriorityControl100PutRequest) other);
        return ((((((((((((((this.hourEnd == rhs.hourEnd)||((this.hourEnd!= null)&&this.hourEnd.equals(rhs.hourEnd)))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaHourBegin == rhs.criteriaHourBegin)||((this.criteriaHourBegin!= null)&&this.criteriaHourBegin.equals(rhs.criteriaHourBegin))))&&((this.criteriaHourEnd == rhs.criteriaHourEnd)||((this.criteriaHourEnd!= null)&&this.criteriaHourEnd.equals(rhs.criteriaHourEnd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.hourBegin == rhs.hourBegin)||((this.hourBegin!= null)&&this.hourBegin.equals(rhs.hourBegin))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.criteriaPriority == rhs.criteriaPriority)||((this.criteriaPriority!= null)&&this.criteriaPriority.equals(rhs.criteriaPriority))))&&((this.criteriaBeginDate == rhs.criteriaBeginDate)||((this.criteriaBeginDate!= null)&&this.criteriaBeginDate.equals(rhs.criteriaBeginDate))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
