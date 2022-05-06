
package com.ellucian.generated.bpapi.ban.combined_academic_standing_codes.v1_0_0;

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
    "preventRegInd",
    "activityDate",
    "code",
    "maxRegHours",
    "minRegHours",
    "sysReqInd",
    "vrMsgNo",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class CombinedAcademicStandingCodes100GetResponse {

    /**
     * Lineage reference object : STVCAST_PREVENT_REG_IND
     * 
     */
    @JsonProperty("preventRegInd")
    @JsonPropertyDescription("Lineage reference object : STVCAST_PREVENT_REG_IND")
    private String preventRegInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCAST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCAST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVCAST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCAST_CODE")
    private String code;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : STVCAST_MAX_REG_HOURS
     * 
     */
    @JsonProperty("maxRegHours")
    @JsonPropertyDescription("Lineage reference object : STVCAST_MAX_REG_HOURS")
    private Double maxRegHours;
    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : STVCAST_MIN_REG_HOURS
     * 
     */
    @JsonProperty("minRegHours")
    @JsonPropertyDescription("Lineage reference object : STVCAST_MIN_REG_HOURS")
    private Double minRegHours;
    /**
     * Lineage reference object : STVCAST_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    @JsonPropertyDescription("Lineage reference object : STVCAST_SYS_REQ_IND")
    private String sysReqInd;
    /**
     * Voice Message
     * <p>
     * Lineage reference object : STVCAST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVCAST_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * User ID
     * <p>
     * Lineage reference object : STVCAST_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : STVCAST_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCAST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCAST_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVCAST_PREVENT_REG_IND
     * 
     */
    @JsonProperty("preventRegInd")
    public String getPreventRegInd() {
        return preventRegInd;
    }

    /**
     * Lineage reference object : STVCAST_PREVENT_REG_IND
     * 
     */
    @JsonProperty("preventRegInd")
    public void setPreventRegInd(String preventRegInd) {
        this.preventRegInd = preventRegInd;
    }

    public CombinedAcademicStandingCodes100GetResponse withPreventRegInd(String preventRegInd) {
        this.preventRegInd = preventRegInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCAST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCAST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CombinedAcademicStandingCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVCAST_CODE
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
     * Lineage reference object : STVCAST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CombinedAcademicStandingCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : STVCAST_MAX_REG_HOURS
     * 
     */
    @JsonProperty("maxRegHours")
    public Double getMaxRegHours() {
        return maxRegHours;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : STVCAST_MAX_REG_HOURS
     * 
     */
    @JsonProperty("maxRegHours")
    public void setMaxRegHours(Double maxRegHours) {
        this.maxRegHours = maxRegHours;
    }

    public CombinedAcademicStandingCodes100GetResponse withMaxRegHours(Double maxRegHours) {
        this.maxRegHours = maxRegHours;
        return this;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : STVCAST_MIN_REG_HOURS
     * 
     */
    @JsonProperty("minRegHours")
    public Double getMinRegHours() {
        return minRegHours;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : STVCAST_MIN_REG_HOURS
     * 
     */
    @JsonProperty("minRegHours")
    public void setMinRegHours(Double minRegHours) {
        this.minRegHours = minRegHours;
    }

    public CombinedAcademicStandingCodes100GetResponse withMinRegHours(Double minRegHours) {
        this.minRegHours = minRegHours;
        return this;
    }

    /**
     * Lineage reference object : STVCAST_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    public String getSysReqInd() {
        return sysReqInd;
    }

    /**
     * Lineage reference object : STVCAST_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    public void setSysReqInd(String sysReqInd) {
        this.sysReqInd = sysReqInd;
    }

    public CombinedAcademicStandingCodes100GetResponse withSysReqInd(String sysReqInd) {
        this.sysReqInd = sysReqInd;
        return this;
    }

    /**
     * Voice Message
     * <p>
     * Lineage reference object : STVCAST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Message
     * <p>
     * Lineage reference object : STVCAST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public CombinedAcademicStandingCodes100GetResponse withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : STVCAST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : STVCAST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CombinedAcademicStandingCodes100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCAST_DESC
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
     * Lineage reference object : STVCAST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CombinedAcademicStandingCodes100GetResponse withDesc(String desc) {
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

    public CombinedAcademicStandingCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CombinedAcademicStandingCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preventRegInd");
        sb.append('=');
        sb.append(((this.preventRegInd == null)?"<null>":this.preventRegInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("maxRegHours");
        sb.append('=');
        sb.append(((this.maxRegHours == null)?"<null>":this.maxRegHours));
        sb.append(',');
        sb.append("minRegHours");
        sb.append('=');
        sb.append(((this.minRegHours == null)?"<null>":this.minRegHours));
        sb.append(',');
        sb.append("sysReqInd");
        sb.append('=');
        sb.append(((this.sysReqInd == null)?"<null>":this.sysReqInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
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
        result = ((result* 31)+((this.preventRegInd == null)? 0 :this.preventRegInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.maxRegHours == null)? 0 :this.maxRegHours.hashCode()));
        result = ((result* 31)+((this.minRegHours == null)? 0 :this.minRegHours.hashCode()));
        result = ((result* 31)+((this.sysReqInd == null)? 0 :this.sysReqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CombinedAcademicStandingCodes100GetResponse) == false) {
            return false;
        }
        CombinedAcademicStandingCodes100GetResponse rhs = ((CombinedAcademicStandingCodes100GetResponse) other);
        return (((((((((((this.preventRegInd == rhs.preventRegInd)||((this.preventRegInd!= null)&&this.preventRegInd.equals(rhs.preventRegInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.maxRegHours == rhs.maxRegHours)||((this.maxRegHours!= null)&&this.maxRegHours.equals(rhs.maxRegHours))))&&((this.minRegHours == rhs.minRegHours)||((this.minRegHours!= null)&&this.minRegHours.equals(rhs.minRegHours))))&&((this.sysReqInd == rhs.sysReqInd)||((this.sysReqInd!= null)&&this.sysReqInd.equals(rhs.sysReqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
