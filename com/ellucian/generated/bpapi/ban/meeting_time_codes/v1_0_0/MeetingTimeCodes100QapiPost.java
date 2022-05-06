
package com.ellucian.generated.bpapi.ban.meeting_time_codes.v1_0_0;

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
    "beginTime",
    "code",
    "endTime",
    "friDay",
    "monDay",
    "satDay",
    "sunDay",
    "thuDay",
    "tueDay",
    "wedDay"
})
@Generated("jsonschema2pojo")
public class MeetingTimeCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVMEET_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVMEET_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Begin Time
     * <p>
     * Lineage reference object : STVMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    @JsonPropertyDescription("Lineage reference object : STVMEET_BEGIN_TIME")
    private String beginTime;
    /**
     * Code
     * <p>
     * Lineage reference object : STVMEET_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVMEET_CODE")
    private String code;
    /**
     * End Time
     * <p>
     * Lineage reference object : STVMEET_END_TIME
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Lineage reference object : STVMEET_END_TIME")
    private String endTime;
    /**
     * Lineage reference object : STVMEET_FRI_DAY
     * 
     */
    @JsonProperty("friDay")
    @JsonPropertyDescription("Lineage reference object : STVMEET_FRI_DAY")
    private String friDay;
    /**
     * Lineage reference object : STVMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    @JsonPropertyDescription("Lineage reference object : STVMEET_MON_DAY")
    private String monDay;
    /**
     * Lineage reference object : STVMEET_SAT_DAY
     * 
     */
    @JsonProperty("satDay")
    @JsonPropertyDescription("Lineage reference object : STVMEET_SAT_DAY")
    private String satDay;
    /**
     * Lineage reference object : STVMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    @JsonPropertyDescription("Lineage reference object : STVMEET_SUN_DAY")
    private String sunDay;
    /**
     * Lineage reference object : STVMEET_THU_DAY
     * 
     */
    @JsonProperty("thuDay")
    @JsonPropertyDescription("Lineage reference object : STVMEET_THU_DAY")
    private String thuDay;
    /**
     * Lineage reference object : STVMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    @JsonPropertyDescription("Lineage reference object : STVMEET_TUE_DAY")
    private String tueDay;
    /**
     * Lineage reference object : STVMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    @JsonPropertyDescription("Lineage reference object : STVMEET_WED_DAY")
    private String wedDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVMEET_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVMEET_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public MeetingTimeCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : STVMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : STVMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public MeetingTimeCodes100QapiPost withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVMEET_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVMEET_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public MeetingTimeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : STVMEET_END_TIME
     * 
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : STVMEET_END_TIME
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public MeetingTimeCodes100QapiPost withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Lineage reference object : STVMEET_FRI_DAY
     * 
     */
    @JsonProperty("friDay")
    public String getFriDay() {
        return friDay;
    }

    /**
     * Lineage reference object : STVMEET_FRI_DAY
     * 
     */
    @JsonProperty("friDay")
    public void setFriDay(String friDay) {
        this.friDay = friDay;
    }

    public MeetingTimeCodes100QapiPost withFriDay(String friDay) {
        this.friDay = friDay;
        return this;
    }

    /**
     * Lineage reference object : STVMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    public String getMonDay() {
        return monDay;
    }

    /**
     * Lineage reference object : STVMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public MeetingTimeCodes100QapiPost withMonDay(String monDay) {
        this.monDay = monDay;
        return this;
    }

    /**
     * Lineage reference object : STVMEET_SAT_DAY
     * 
     */
    @JsonProperty("satDay")
    public String getSatDay() {
        return satDay;
    }

    /**
     * Lineage reference object : STVMEET_SAT_DAY
     * 
     */
    @JsonProperty("satDay")
    public void setSatDay(String satDay) {
        this.satDay = satDay;
    }

    public MeetingTimeCodes100QapiPost withSatDay(String satDay) {
        this.satDay = satDay;
        return this;
    }

    /**
     * Lineage reference object : STVMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    public String getSunDay() {
        return sunDay;
    }

    /**
     * Lineage reference object : STVMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    public void setSunDay(String sunDay) {
        this.sunDay = sunDay;
    }

    public MeetingTimeCodes100QapiPost withSunDay(String sunDay) {
        this.sunDay = sunDay;
        return this;
    }

    /**
     * Lineage reference object : STVMEET_THU_DAY
     * 
     */
    @JsonProperty("thuDay")
    public String getThuDay() {
        return thuDay;
    }

    /**
     * Lineage reference object : STVMEET_THU_DAY
     * 
     */
    @JsonProperty("thuDay")
    public void setThuDay(String thuDay) {
        this.thuDay = thuDay;
    }

    public MeetingTimeCodes100QapiPost withThuDay(String thuDay) {
        this.thuDay = thuDay;
        return this;
    }

    /**
     * Lineage reference object : STVMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    public String getTueDay() {
        return tueDay;
    }

    /**
     * Lineage reference object : STVMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    public void setTueDay(String tueDay) {
        this.tueDay = tueDay;
    }

    public MeetingTimeCodes100QapiPost withTueDay(String tueDay) {
        this.tueDay = tueDay;
        return this;
    }

    /**
     * Lineage reference object : STVMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    public String getWedDay() {
        return wedDay;
    }

    /**
     * Lineage reference object : STVMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    public void setWedDay(String wedDay) {
        this.wedDay = wedDay;
    }

    public MeetingTimeCodes100QapiPost withWedDay(String wedDay) {
        this.wedDay = wedDay;
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

    public MeetingTimeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MeetingTimeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("friDay");
        sb.append('=');
        sb.append(((this.friDay == null)?"<null>":this.friDay));
        sb.append(',');
        sb.append("monDay");
        sb.append('=');
        sb.append(((this.monDay == null)?"<null>":this.monDay));
        sb.append(',');
        sb.append("satDay");
        sb.append('=');
        sb.append(((this.satDay == null)?"<null>":this.satDay));
        sb.append(',');
        sb.append("sunDay");
        sb.append('=');
        sb.append(((this.sunDay == null)?"<null>":this.sunDay));
        sb.append(',');
        sb.append("thuDay");
        sb.append('=');
        sb.append(((this.thuDay == null)?"<null>":this.thuDay));
        sb.append(',');
        sb.append("tueDay");
        sb.append('=');
        sb.append(((this.tueDay == null)?"<null>":this.tueDay));
        sb.append(',');
        sb.append("wedDay");
        sb.append('=');
        sb.append(((this.wedDay == null)?"<null>":this.wedDay));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.monDay == null)? 0 :this.monDay.hashCode()));
        result = ((result* 31)+((this.satDay == null)? 0 :this.satDay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeetingTimeCodes100QapiPost) == false) {
            return false;
        }
        MeetingTimeCodes100QapiPost rhs = ((MeetingTimeCodes100QapiPost) other);
        return (((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))));
    }

}
