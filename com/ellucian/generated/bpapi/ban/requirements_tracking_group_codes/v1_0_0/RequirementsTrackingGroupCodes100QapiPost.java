
package com.ellucian.generated.bpapi.ban.requirements_tracking_group_codes.v1_0_0;

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
    "activeInd",
    "activityDate",
    "code",
    "desc",
    "priority"
})
@Generated("jsonschema2pojo")
public class RequirementsTrackingGroupCodes100QapiPost {

    /**
     * Lineage reference object : RTVTGRP_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : RTVTGRP_ACTIVE_IND")
    private String activeInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVTGRP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Group Code
     * <p>
     * Lineage reference object : RTVTGRP_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVTGRP_CODE")
    private String code;
    /**
     * Group Description
     * <p>
     * Lineage reference object : RTVTGRP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVTGRP_DESC")
    private String desc;
    /**
     * Priority
     * <p>
     * Lineage reference object : RTVTGRP_PRIORITY
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : RTVTGRP_PRIORITY")
    private Double priority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RTVTGRP_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : RTVTGRP_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public RequirementsTrackingGroupCodes100QapiPost withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RequirementsTrackingGroupCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Group Code
     * <p>
     * Lineage reference object : RTVTGRP_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Group Code
     * <p>
     * Lineage reference object : RTVTGRP_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public RequirementsTrackingGroupCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Group Description
     * <p>
     * Lineage reference object : RTVTGRP_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Group Description
     * <p>
     * Lineage reference object : RTVTGRP_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public RequirementsTrackingGroupCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : RTVTGRP_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : RTVTGRP_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public RequirementsTrackingGroupCodes100QapiPost withPriority(Double priority) {
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

    public RequirementsTrackingGroupCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequirementsTrackingGroupCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequirementsTrackingGroupCodes100QapiPost) == false) {
            return false;
        }
        RequirementsTrackingGroupCodes100QapiPost rhs = ((RequirementsTrackingGroupCodes100QapiPost) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
