
package com.ellucian.generated.bpapi.ban.packaging_group_codes.v1_0_0;

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
    "awardPriority",
    "code",
    "desc",
    "groupPriority",
    "infoAccessInd"
})
@Generated("jsonschema2pojo")
public class PackagingGroupCodes100QapiPost {

    /**
     * Lineage reference object : RTVPGRP_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : RTVPGRP_ACTIVE_IND")
    private String activeInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVPGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVPGRP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Award Priority
     * <p>
     * Lineage reference object : RTVPGRP_AWARD_PRIORITY
     * 
     */
    @JsonProperty("awardPriority")
    @JsonPropertyDescription("Lineage reference object : RTVPGRP_AWARD_PRIORITY")
    private Double awardPriority;
    /**
     * Group Code
     * <p>
     * Lineage reference object : RTVPGRP_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVPGRP_CODE")
    private String code;
    /**
     * Group Description
     * <p>
     * Lineage reference object : RTVPGRP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVPGRP_DESC")
    private String desc;
    /**
     * Group Priority
     * <p>
     * Lineage reference object : RTVPGRP_GROUP_PRIORITY
     * 
     */
    @JsonProperty("groupPriority")
    @JsonPropertyDescription("Lineage reference object : RTVPGRP_GROUP_PRIORITY")
    private Double groupPriority;
    /**
     * Lineage reference object : RTVPGRP_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RTVPGRP_INFO_ACCESS_IND")
    private String infoAccessInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RTVPGRP_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : RTVPGRP_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public PackagingGroupCodes100QapiPost withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVPGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVPGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PackagingGroupCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Award Priority
     * <p>
     * Lineage reference object : RTVPGRP_AWARD_PRIORITY
     * 
     */
    @JsonProperty("awardPriority")
    public Double getAwardPriority() {
        return awardPriority;
    }

    /**
     * Award Priority
     * <p>
     * Lineage reference object : RTVPGRP_AWARD_PRIORITY
     * 
     */
    @JsonProperty("awardPriority")
    public void setAwardPriority(Double awardPriority) {
        this.awardPriority = awardPriority;
    }

    public PackagingGroupCodes100QapiPost withAwardPriority(Double awardPriority) {
        this.awardPriority = awardPriority;
        return this;
    }

    /**
     * Group Code
     * <p>
     * Lineage reference object : RTVPGRP_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Group Code
     * <p>
     * Lineage reference object : RTVPGRP_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PackagingGroupCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Group Description
     * <p>
     * Lineage reference object : RTVPGRP_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Group Description
     * <p>
     * Lineage reference object : RTVPGRP_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PackagingGroupCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Group Priority
     * <p>
     * Lineage reference object : RTVPGRP_GROUP_PRIORITY
     * 
     */
    @JsonProperty("groupPriority")
    public Double getGroupPriority() {
        return groupPriority;
    }

    /**
     * Group Priority
     * <p>
     * Lineage reference object : RTVPGRP_GROUP_PRIORITY
     * 
     */
    @JsonProperty("groupPriority")
    public void setGroupPriority(Double groupPriority) {
        this.groupPriority = groupPriority;
    }

    public PackagingGroupCodes100QapiPost withGroupPriority(Double groupPriority) {
        this.groupPriority = groupPriority;
        return this;
    }

    /**
     * Lineage reference object : RTVPGRP_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RTVPGRP_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public PackagingGroupCodes100QapiPost withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
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

    public PackagingGroupCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PackagingGroupCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("awardPriority");
        sb.append('=');
        sb.append(((this.awardPriority == null)?"<null>":this.awardPriority));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("groupPriority");
        sb.append('=');
        sb.append(((this.groupPriority == null)?"<null>":this.groupPriority));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
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
        result = ((result* 31)+((this.awardPriority == null)? 0 :this.awardPriority.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.groupPriority == null)? 0 :this.groupPriority.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PackagingGroupCodes100QapiPost) == false) {
            return false;
        }
        PackagingGroupCodes100QapiPost rhs = ((PackagingGroupCodes100QapiPost) other);
        return (((((((((this.awardPriority == rhs.awardPriority)||((this.awardPriority!= null)&&this.awardPriority.equals(rhs.awardPriority)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.groupPriority == rhs.groupPriority)||((this.groupPriority!= null)&&this.groupPriority.equals(rhs.groupPriority))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
