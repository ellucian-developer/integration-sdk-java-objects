
package com.ellucian.generated.bpapi.ban.application_checklist_sources.v1_0_0;

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
    "code",
    "sysReqInd",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class ApplicationChecklistSources100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCKSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCKSR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Admissions Checklist Source Code
     * <p>
     * Lineage reference object : STVCKSR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCKSR_CODE")
    private String code;
    /**
     * Lineage reference object : STVCKSR_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    @JsonPropertyDescription("Lineage reference object : STVCKSR_SYS_REQ_IND")
    private String sysReqInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : STVCKSR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : STVCKSR_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCKSR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCKSR_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCKSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCKSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ApplicationChecklistSources100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Admissions Checklist Source Code
     * <p>
     * Lineage reference object : STVCKSR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Admissions Checklist Source Code
     * <p>
     * Lineage reference object : STVCKSR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ApplicationChecklistSources100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVCKSR_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    public String getSysReqInd() {
        return sysReqInd;
    }

    /**
     * Lineage reference object : STVCKSR_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    public void setSysReqInd(String sysReqInd) {
        this.sysReqInd = sysReqInd;
    }

    public ApplicationChecklistSources100GetResponse withSysReqInd(String sysReqInd) {
        this.sysReqInd = sysReqInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : STVCKSR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : STVCKSR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApplicationChecklistSources100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCKSR_DESC
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
     * Lineage reference object : STVCKSR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ApplicationChecklistSources100GetResponse withDesc(String desc) {
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

    public ApplicationChecklistSources100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationChecklistSources100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("sysReqInd");
        sb.append('=');
        sb.append(((this.sysReqInd == null)?"<null>":this.sysReqInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.sysReqInd == null)? 0 :this.sysReqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationChecklistSources100GetResponse) == false) {
            return false;
        }
        ApplicationChecklistSources100GetResponse rhs = ((ApplicationChecklistSources100GetResponse) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.sysReqInd == rhs.sysReqInd)||((this.sysReqInd!= null)&&this.sysReqInd.equals(rhs.sysReqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
