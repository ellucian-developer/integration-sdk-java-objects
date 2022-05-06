
package com.ellucian.generated.bpapi.ban.section_details_read_only.v1_0_0;

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
    "endDate",
    "mtypType",
    "wedDay",
    "tueDay",
    "userId",
    "catagory",
    "sunDay",
    "activityDate",
    "friDay",
    "thuDay",
    "beginTime",
    "endTime",
    "startDate",
    "monDay",
    "satDay"
})
@Generated("jsonschema2pojo")
public class Ssrmeet {

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_DATE")
    private Date endDate;
    /**
     * Meeting Type
     * <p>
     * 
     * 
     */
    @JsonProperty("mtypType")
    private String mtypType;
    /**
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_WED_DAY")
    private String wedDay;
    /**
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_TUE_DAY")
    private String tueDay;
    /**
     * Lineage reference object : SSRMEET_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_USER_ID")
    private String userId;
    /**
     * Session
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("catagory")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CATAGORY")
    private String catagory;
    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SUN_DAY")
    private String sunDay;
    /**
     * Lineage reference object : SSRMEET_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SSRMEET_FRI_DAY
     * 
     */
    @JsonProperty("friDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_FRI_DAY")
    private String friDay;
    /**
     * Lineage reference object : SSRMEET_THU_DAY
     * 
     */
    @JsonProperty("thuDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_THU_DAY")
    private String thuDay;
    /**
     * Start Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BEGIN_TIME")
    private String beginTime;
    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_TIME")
    private String endTime;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_START_DATE")
    private Date startDate;
    /**
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MON_DAY")
    private String monDay;
    /**
     * Lineage reference object : SSRMEET_SAT_DAY
     * 
     */
    @JsonProperty("satDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SAT_DAY")
    private String satDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Ssrmeet withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Meeting Type
     * <p>
     * 
     * 
     */
    @JsonProperty("mtypType")
    public String getMtypType() {
        return mtypType;
    }

    /**
     * Meeting Type
     * <p>
     * 
     * 
     */
    @JsonProperty("mtypType")
    public void setMtypType(String mtypType) {
        this.mtypType = mtypType;
    }

    public Ssrmeet withMtypType(String mtypType) {
        this.mtypType = mtypType;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    public String getWedDay() {
        return wedDay;
    }

    /**
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    public void setWedDay(String wedDay) {
        this.wedDay = wedDay;
    }

    public Ssrmeet withWedDay(String wedDay) {
        this.wedDay = wedDay;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    public String getTueDay() {
        return tueDay;
    }

    /**
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    public void setTueDay(String tueDay) {
        this.tueDay = tueDay;
    }

    public Ssrmeet withTueDay(String tueDay) {
        this.tueDay = tueDay;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SSRMEET_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ssrmeet withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("catagory")
    public String getCatagory() {
        return catagory;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("catagory")
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public Ssrmeet withCatagory(String catagory) {
        this.catagory = catagory;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    public String getSunDay() {
        return sunDay;
    }

    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    public void setSunDay(String sunDay) {
        this.sunDay = sunDay;
    }

    public Ssrmeet withSunDay(String sunDay) {
        this.sunDay = sunDay;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SSRMEET_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrmeet withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_FRI_DAY
     * 
     */
    @JsonProperty("friDay")
    public String getFriDay() {
        return friDay;
    }

    /**
     * Lineage reference object : SSRMEET_FRI_DAY
     * 
     */
    @JsonProperty("friDay")
    public void setFriDay(String friDay) {
        this.friDay = friDay;
    }

    public Ssrmeet withFriDay(String friDay) {
        this.friDay = friDay;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_THU_DAY
     * 
     */
    @JsonProperty("thuDay")
    public String getThuDay() {
        return thuDay;
    }

    /**
     * Lineage reference object : SSRMEET_THU_DAY
     * 
     */
    @JsonProperty("thuDay")
    public void setThuDay(String thuDay) {
        this.thuDay = thuDay;
    }

    public Ssrmeet withThuDay(String thuDay) {
        this.thuDay = thuDay;
        return this;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Ssrmeet withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Ssrmeet withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Ssrmeet withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    public String getMonDay() {
        return monDay;
    }

    /**
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public Ssrmeet withMonDay(String monDay) {
        this.monDay = monDay;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_SAT_DAY
     * 
     */
    @JsonProperty("satDay")
    public String getSatDay() {
        return satDay;
    }

    /**
     * Lineage reference object : SSRMEET_SAT_DAY
     * 
     */
    @JsonProperty("satDay")
    public void setSatDay(String satDay) {
        this.satDay = satDay;
    }

    public Ssrmeet withSatDay(String satDay) {
        this.satDay = satDay;
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

    public Ssrmeet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrmeet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("mtypType");
        sb.append('=');
        sb.append(((this.mtypType == null)?"<null>":this.mtypType));
        sb.append(',');
        sb.append("wedDay");
        sb.append('=');
        sb.append(((this.wedDay == null)?"<null>":this.wedDay));
        sb.append(',');
        sb.append("tueDay");
        sb.append('=');
        sb.append(((this.tueDay == null)?"<null>":this.tueDay));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("catagory");
        sb.append('=');
        sb.append(((this.catagory == null)?"<null>":this.catagory));
        sb.append(',');
        sb.append("sunDay");
        sb.append('=');
        sb.append(((this.sunDay == null)?"<null>":this.sunDay));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("friDay");
        sb.append('=');
        sb.append(((this.friDay == null)?"<null>":this.friDay));
        sb.append(',');
        sb.append("thuDay");
        sb.append('=');
        sb.append(((this.thuDay == null)?"<null>":this.thuDay));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("monDay");
        sb.append('=');
        sb.append(((this.monDay == null)?"<null>":this.monDay));
        sb.append(',');
        sb.append("satDay");
        sb.append('=');
        sb.append(((this.satDay == null)?"<null>":this.satDay));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.mtypType == null)? 0 :this.mtypType.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.catagory == null)? 0 :this.catagory.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.monDay == null)? 0 :this.monDay.hashCode()));
        result = ((result* 31)+((this.satDay == null)? 0 :this.satDay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrmeet) == false) {
            return false;
        }
        Ssrmeet rhs = ((Ssrmeet) other);
        return (((((((((((((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.mtypType == rhs.mtypType)||((this.mtypType!= null)&&this.mtypType.equals(rhs.mtypType))))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.catagory == rhs.catagory)||((this.catagory!= null)&&this.catagory.equals(rhs.catagory))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))));
    }

}
