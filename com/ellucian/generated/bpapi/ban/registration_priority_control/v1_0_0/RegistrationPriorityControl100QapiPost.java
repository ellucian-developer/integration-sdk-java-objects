
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
    "keyblocTermCode",
    "beginDate",
    "hourBegin",
    "endDate",
    "hourEnd",
    "priority",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class RegistrationPriorityControl100QapiPost {

    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_BEGIN_DATE")
    private Date beginDate;
    /**
     * Start Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
     * 
     */
    @JsonProperty("hourBegin")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_HOUR_BEGIN")
    private String hourBegin;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_END_DATE")
    private Date endDate;
    /**
     * End Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
     * 
     */
    @JsonProperty("hourEnd")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_HOUR_END")
    private String hourEnd;
    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_PRIORITY")
    private Double priority;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRWCTL_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public RegistrationPriorityControl100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SFRWCTL_BEGIN_DATE
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
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public RegistrationPriorityControl100QapiPost withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_BEGIN
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
     * 
     */
    @JsonProperty("hourBegin")
    public void setHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
    }

    public RegistrationPriorityControl100QapiPost withHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFRWCTL_END_DATE
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
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public RegistrationPriorityControl100QapiPost withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRWCTL_HOUR_END
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
     * 
     */
    @JsonProperty("hourEnd")
    public void setHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
    }

    public RegistrationPriorityControl100QapiPost withHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SFRWCTL_PRIORITY
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
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public RegistrationPriorityControl100QapiPost withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RegistrationPriorityControl100QapiPost withActivityDate(Date activityDate) {
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

    public RegistrationPriorityControl100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationPriorityControl100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("hourBegin");
        sb.append('=');
        sb.append(((this.hourBegin == null)?"<null>":this.hourBegin));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("hourEnd");
        sb.append('=');
        sb.append(((this.hourEnd == null)?"<null>":this.hourEnd));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        result = ((result* 31)+((this.hourEnd == null)? 0 :this.hourEnd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.hourBegin == null)? 0 :this.hourBegin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationPriorityControl100QapiPost) == false) {
            return false;
        }
        RegistrationPriorityControl100QapiPost rhs = ((RegistrationPriorityControl100QapiPost) other);
        return (((((((((this.hourEnd == rhs.hourEnd)||((this.hourEnd!= null)&&this.hourEnd.equals(rhs.hourEnd)))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.hourBegin == rhs.hourBegin)||((this.hourBegin!= null)&&this.hourBegin.equals(rhs.hourBegin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))));
    }

}
