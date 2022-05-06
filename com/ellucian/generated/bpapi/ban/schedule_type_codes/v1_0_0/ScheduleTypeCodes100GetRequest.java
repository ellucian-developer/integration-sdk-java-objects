
package com.ellucian.generated.bpapi.ban.schedule_type_codes.v1_0_0;

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
    "coopInd",
    "activityDate",
    "code",
    "autoSchedulerInd",
    "insmCode",
    "vrMsgNo",
    "desc"
})
@Generated("jsonschema2pojo")
public class ScheduleTypeCodes100GetRequest {

    /**
     * Lineage reference object : STVSCHD_COOP_IND
     * 
     */
    @JsonProperty("coopInd")
    @JsonPropertyDescription("Lineage reference object : STVSCHD_COOP_IND")
    private String coopInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSCHD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVSCHD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVSCHD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVSCHD_CODE")
    private String code;
    /**
     * Lineage reference object : STVSCHD_AUTO_SCHEDULER_IND
     * 
     */
    @JsonProperty("autoSchedulerInd")
    @JsonPropertyDescription("Lineage reference object : STVSCHD_AUTO_SCHEDULER_IND")
    private String autoSchedulerInd;
    /**
     * Instructional Method
     * <p>
     * Lineage reference object : STVSCHD_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    @JsonPropertyDescription("Lineage reference object : STVSCHD_INSM_CODE, Lookup lineage reference object : gtvinsm")
    private String insmCode;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSCHD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVSCHD_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Description
     * <p>
     * Lineage reference object : STVSCHD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVSCHD_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVSCHD_COOP_IND
     * 
     */
    @JsonProperty("coopInd")
    public String getCoopInd() {
        return coopInd;
    }

    /**
     * Lineage reference object : STVSCHD_COOP_IND
     * 
     */
    @JsonProperty("coopInd")
    public void setCoopInd(String coopInd) {
        this.coopInd = coopInd;
    }

    public ScheduleTypeCodes100GetRequest withCoopInd(String coopInd) {
        this.coopInd = coopInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSCHD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSCHD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ScheduleTypeCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVSCHD_CODE
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
     * Lineage reference object : STVSCHD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ScheduleTypeCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVSCHD_AUTO_SCHEDULER_IND
     * 
     */
    @JsonProperty("autoSchedulerInd")
    public String getAutoSchedulerInd() {
        return autoSchedulerInd;
    }

    /**
     * Lineage reference object : STVSCHD_AUTO_SCHEDULER_IND
     * 
     */
    @JsonProperty("autoSchedulerInd")
    public void setAutoSchedulerInd(String autoSchedulerInd) {
        this.autoSchedulerInd = autoSchedulerInd;
    }

    public ScheduleTypeCodes100GetRequest withAutoSchedulerInd(String autoSchedulerInd) {
        this.autoSchedulerInd = autoSchedulerInd;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : STVSCHD_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    public String getInsmCode() {
        return insmCode;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : STVSCHD_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    public void setInsmCode(String insmCode) {
        this.insmCode = insmCode;
    }

    public ScheduleTypeCodes100GetRequest withInsmCode(String insmCode) {
        this.insmCode = insmCode;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSCHD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSCHD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public ScheduleTypeCodes100GetRequest withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSCHD_DESC
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
     * Lineage reference object : STVSCHD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ScheduleTypeCodes100GetRequest withDesc(String desc) {
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

    public ScheduleTypeCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleTypeCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coopInd");
        sb.append('=');
        sb.append(((this.coopInd == null)?"<null>":this.coopInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("autoSchedulerInd");
        sb.append('=');
        sb.append(((this.autoSchedulerInd == null)?"<null>":this.autoSchedulerInd));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
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
        result = ((result* 31)+((this.coopInd == null)? 0 :this.coopInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.autoSchedulerInd == null)? 0 :this.autoSchedulerInd.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleTypeCodes100GetRequest) == false) {
            return false;
        }
        ScheduleTypeCodes100GetRequest rhs = ((ScheduleTypeCodes100GetRequest) other);
        return (((((((((this.coopInd == rhs.coopInd)||((this.coopInd!= null)&&this.coopInd.equals(rhs.coopInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.autoSchedulerInd == rhs.autoSchedulerInd)||((this.autoSchedulerInd!= null)&&this.autoSchedulerInd.equals(rhs.autoSchedulerInd))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
