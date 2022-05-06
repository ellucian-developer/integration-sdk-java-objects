
package com.ellucian.generated.bpapi.ban.ca_course_repetition_family_codes.v1_0_0;

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
    "repeatLimit",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class CaCourseRepetitionFamilyCodes100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVCRFM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVVCRFM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : SVVCRFM_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SVVCRFM_CODE")
    private String code;
    /**
     * Repetition Limit
     * <p>
     * Lineage reference object : SVVCRFM_REPEAT_LIMIT
     * (Required)
     * 
     */
    @JsonProperty("repeatLimit")
    @JsonPropertyDescription("Lineage reference object : SVVCRFM_REPEAT_LIMIT")
    private Double repeatLimit;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVVCRFM_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVVCRFM_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : SVVCRFM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SVVCRFM_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVCRFM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVCRFM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaCourseRepetitionFamilyCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVCRFM_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVCRFM_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaCourseRepetitionFamilyCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Repetition Limit
     * <p>
     * Lineage reference object : SVVCRFM_REPEAT_LIMIT
     * (Required)
     * 
     */
    @JsonProperty("repeatLimit")
    public Double getRepeatLimit() {
        return repeatLimit;
    }

    /**
     * Repetition Limit
     * <p>
     * Lineage reference object : SVVCRFM_REPEAT_LIMIT
     * (Required)
     * 
     */
    @JsonProperty("repeatLimit")
    public void setRepeatLimit(Double repeatLimit) {
        this.repeatLimit = repeatLimit;
    }

    public CaCourseRepetitionFamilyCodes100GetRequest withRepeatLimit(Double repeatLimit) {
        this.repeatLimit = repeatLimit;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVVCRFM_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVVCRFM_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CaCourseRepetitionFamilyCodes100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVCRFM_DESC
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
     * Lineage reference object : SVVCRFM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaCourseRepetitionFamilyCodes100GetRequest withDesc(String desc) {
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

    public CaCourseRepetitionFamilyCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaCourseRepetitionFamilyCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("repeatLimit");
        sb.append('=');
        sb.append(((this.repeatLimit == null)?"<null>":this.repeatLimit));
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
        result = ((result* 31)+((this.repeatLimit == null)? 0 :this.repeatLimit.hashCode()));
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
        if ((other instanceof CaCourseRepetitionFamilyCodes100GetRequest) == false) {
            return false;
        }
        CaCourseRepetitionFamilyCodes100GetRequest rhs = ((CaCourseRepetitionFamilyCodes100GetRequest) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.repeatLimit == rhs.repeatLimit)||((this.repeatLimit!= null)&&this.repeatLimit.equals(rhs.repeatLimit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
