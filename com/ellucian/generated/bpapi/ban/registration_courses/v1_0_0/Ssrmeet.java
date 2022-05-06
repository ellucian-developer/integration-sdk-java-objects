
package com.ellucian.generated.bpapi.ban.registration_courses.v1_0_0;

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
    "buildingDescription",
    "wedDay",
    "tueDay",
    "roomCode",
    "sunDay",
    "friDay",
    "thuDay",
    "beginTime",
    "endTime",
    "bldgCode",
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
     * Building Description
     * <p>
     * 
     * 
     */
    @JsonProperty("buildingDescription")
    private String buildingDescription;
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
     * Room Number
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("roomCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_ROOM_CODE")
    private String roomCode;
    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SUN_DAY")
    private String sunDay;
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
     * Begin Time
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
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE
     * 
     */
    @JsonProperty("bldgCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BLDG_CODE")
    private String bldgCode;
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
     * Building Description
     * <p>
     * 
     * 
     */
    @JsonProperty("buildingDescription")
    public String getBuildingDescription() {
        return buildingDescription;
    }

    /**
     * Building Description
     * <p>
     * 
     * 
     */
    @JsonProperty("buildingDescription")
    public void setBuildingDescription(String buildingDescription) {
        this.buildingDescription = buildingDescription;
    }

    public Ssrmeet withBuildingDescription(String buildingDescription) {
        this.buildingDescription = buildingDescription;
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
     * Room Number
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("roomCode")
    public String getRoomCode() {
        return roomCode;
    }

    /**
     * Room Number
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("roomCode")
    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public Ssrmeet withRoomCode(String roomCode) {
        this.roomCode = roomCode;
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
     * Begin Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * Begin Time
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
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE
     * 
     */
    @JsonProperty("bldgCode")
    public String getBldgCode() {
        return bldgCode;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE
     * 
     */
    @JsonProperty("bldgCode")
    public void setBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
    }

    public Ssrmeet withBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
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
        sb.append("buildingDescription");
        sb.append('=');
        sb.append(((this.buildingDescription == null)?"<null>":this.buildingDescription));
        sb.append(',');
        sb.append("wedDay");
        sb.append('=');
        sb.append(((this.wedDay == null)?"<null>":this.wedDay));
        sb.append(',');
        sb.append("tueDay");
        sb.append('=');
        sb.append(((this.tueDay == null)?"<null>":this.tueDay));
        sb.append(',');
        sb.append("roomCode");
        sb.append('=');
        sb.append(((this.roomCode == null)?"<null>":this.roomCode));
        sb.append(',');
        sb.append("sunDay");
        sb.append('=');
        sb.append(((this.sunDay == null)?"<null>":this.sunDay));
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
        sb.append("bldgCode");
        sb.append('=');
        sb.append(((this.bldgCode == null)?"<null>":this.bldgCode));
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
        result = ((result* 31)+((this.buildingDescription == null)? 0 :this.buildingDescription.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.roomCode == null)? 0 :this.roomCode.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bldgCode == null)? 0 :this.bldgCode.hashCode()));
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
        return ((((((((((((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.buildingDescription == rhs.buildingDescription)||((this.buildingDescription!= null)&&this.buildingDescription.equals(rhs.buildingDescription))))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.roomCode == rhs.roomCode)||((this.roomCode!= null)&&this.roomCode.equals(rhs.roomCode))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bldgCode == rhs.bldgCode)||((this.bldgCode!= null)&&this.bldgCode.equals(rhs.bldgCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))));
    }

}
