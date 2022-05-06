
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
    "keyblocTermCode",
    "priority",
    "rgrpCode",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class RegistrationGroupControl100QapiPost {

    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    /**
     * Group Priority
     * <p>
     * Lineage reference object : SFBWCTL_PRIORITY, Lookup lineage reference object : sfrwctl
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : SFBWCTL_PRIORITY, Lookup lineage reference object : sfrwctl")
    private Double priority;
    /**
     * Group Code
     * <p>
     * Lineage reference object : SFBWCTL_RGRP_CODE
     * 
     */
    @JsonProperty("rgrpCode")
    @JsonPropertyDescription("Lineage reference object : SFBWCTL_RGRP_CODE")
    private String rgrpCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFBWCTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFBWCTL_ACTIVITY_DATE")
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

    public RegistrationGroupControl100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
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

    public RegistrationGroupControl100QapiPost withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Group Code
     * <p>
     * Lineage reference object : SFBWCTL_RGRP_CODE
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
     * 
     */
    @JsonProperty("rgrpCode")
    public void setRgrpCode(String rgrpCode) {
        this.rgrpCode = rgrpCode;
    }

    public RegistrationGroupControl100QapiPost withRgrpCode(String rgrpCode) {
        this.rgrpCode = rgrpCode;
        return this;
    }

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

    public RegistrationGroupControl100QapiPost withActivityDate(Date activityDate) {
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

    public RegistrationGroupControl100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationGroupControl100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("rgrpCode");
        sb.append('=');
        sb.append(((this.rgrpCode == null)?"<null>":this.rgrpCode));
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
        result = ((result* 31)+((this.rgrpCode == null)? 0 :this.rgrpCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationGroupControl100QapiPost) == false) {
            return false;
        }
        RegistrationGroupControl100QapiPost rhs = ((RegistrationGroupControl100QapiPost) other);
        return ((((((this.rgrpCode == rhs.rgrpCode)||((this.rgrpCode!= null)&&this.rgrpCode.equals(rhs.rgrpCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))));
    }

}
