
package com.ellucian.generated.bpapi.ban.section_meeting_times.v1_0_0;

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
    "overRide",
    "endDate",
    "meetCode",
    "wedDay",
    "roomAttribDet",
    "tueDay",
    "roomCode",
    "creditHrSess",
    "catagory",
    "schdCode",
    "sunDay",
    "hrsWeek",
    "schsCode",
    "friDay",
    "thuDay",
    "beginTime",
    "endTime",
    "mtypCode",
    "partDet",
    "bldgCode",
    "startDate",
    "monDay",
    "satDay"
})
@Generated("jsonschema2pojo")
public class Ssrmeet__2 {

    /**
     * Override Indicator
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_OVER_RIDE")
    private String overRide;
    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_DATE")
    private Date endDate;
    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("meetCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvmeet")
    private String meetCode;
    /**
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_WED_DAY")
    private String wedDay;
    @JsonProperty("roomAttribDet")
    private String roomAttribDet;
    /**
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_TUE_DAY")
    private String tueDay;
    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("roomCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_ROOM_CODE")
    private String roomCode;
    /**
     * Session Credit Hours
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("creditHrSess")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CREDIT_HR_SESS")
    private Double creditHrSess;
    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * (Required)
     * 
     */
    @JsonProperty("catagory")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CATAGORY")
    private String catagory;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd")
    private String schdCode;
    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SUN_DAY")
    private String sunDay;
    /**
     * Hours per Week
     * <p>
     * Lineage reference object : SSRMEET_HRS_WEEK
     * (Required)
     * 
     */
    @JsonProperty("hrsWeek")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_HRS_WEEK")
    private Double hrsWeek;
    /**
     * Automatic Scheduler
     * <p>
     * Lineage reference object : SSRMEET_SCHS_CODE, Lookup lineage reference object : GTVSCHS
     * 
     */
    @JsonProperty("schsCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SCHS_CODE, Lookup lineage reference object : GTVSCHS")
    private String schsCode;
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
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("mtypCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp")
    private String mtypCode;
    @JsonProperty("partDet")
    private String partDet;
    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("bldgCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg")
    private String bldgCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * (Required)
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
     * Override Indicator
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public String getOverRide() {
        return overRide;
    }

    /**
     * Override Indicator
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public void setOverRide(String overRide) {
        this.overRide = overRide;
    }

    public Ssrmeet__2 withOverRide(String overRide) {
        this.overRide = overRide;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Ssrmeet__2 withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("meetCode")
    public String getMeetCode() {
        return meetCode;
    }

    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("meetCode")
    public void setMeetCode(String meetCode) {
        this.meetCode = meetCode;
    }

    public Ssrmeet__2 withMeetCode(String meetCode) {
        this.meetCode = meetCode;
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

    public Ssrmeet__2 withWedDay(String wedDay) {
        this.wedDay = wedDay;
        return this;
    }

    @JsonProperty("roomAttribDet")
    public String getRoomAttribDet() {
        return roomAttribDet;
    }

    @JsonProperty("roomAttribDet")
    public void setRoomAttribDet(String roomAttribDet) {
        this.roomAttribDet = roomAttribDet;
    }

    public Ssrmeet__2 withRoomAttribDet(String roomAttribDet) {
        this.roomAttribDet = roomAttribDet;
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

    public Ssrmeet__2 withTueDay(String tueDay) {
        this.tueDay = tueDay;
        return this;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("roomCode")
    public String getRoomCode() {
        return roomCode;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("roomCode")
    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public Ssrmeet__2 withRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * Session Credit Hours
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("creditHrSess")
    public Double getCreditHrSess() {
        return creditHrSess;
    }

    /**
     * Session Credit Hours
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("creditHrSess")
    public void setCreditHrSess(Double creditHrSess) {
        this.creditHrSess = creditHrSess;
    }

    public Ssrmeet__2 withCreditHrSess(Double creditHrSess) {
        this.creditHrSess = creditHrSess;
        return this;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * (Required)
     * 
     */
    @JsonProperty("catagory")
    public String getCatagory() {
        return catagory;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * (Required)
     * 
     */
    @JsonProperty("catagory")
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public Ssrmeet__2 withCatagory(String catagory) {
        this.catagory = catagory;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public Ssrmeet__2 withSchdCode(String schdCode) {
        this.schdCode = schdCode;
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

    public Ssrmeet__2 withSunDay(String sunDay) {
        this.sunDay = sunDay;
        return this;
    }

    /**
     * Hours per Week
     * <p>
     * Lineage reference object : SSRMEET_HRS_WEEK
     * (Required)
     * 
     */
    @JsonProperty("hrsWeek")
    public Double getHrsWeek() {
        return hrsWeek;
    }

    /**
     * Hours per Week
     * <p>
     * Lineage reference object : SSRMEET_HRS_WEEK
     * (Required)
     * 
     */
    @JsonProperty("hrsWeek")
    public void setHrsWeek(Double hrsWeek) {
        this.hrsWeek = hrsWeek;
    }

    public Ssrmeet__2 withHrsWeek(Double hrsWeek) {
        this.hrsWeek = hrsWeek;
        return this;
    }

    /**
     * Automatic Scheduler
     * <p>
     * Lineage reference object : SSRMEET_SCHS_CODE, Lookup lineage reference object : GTVSCHS
     * 
     */
    @JsonProperty("schsCode")
    public String getSchsCode() {
        return schsCode;
    }

    /**
     * Automatic Scheduler
     * <p>
     * Lineage reference object : SSRMEET_SCHS_CODE, Lookup lineage reference object : GTVSCHS
     * 
     */
    @JsonProperty("schsCode")
    public void setSchsCode(String schsCode) {
        this.schsCode = schsCode;
    }

    public Ssrmeet__2 withSchsCode(String schsCode) {
        this.schsCode = schsCode;
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

    public Ssrmeet__2 withFriDay(String friDay) {
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

    public Ssrmeet__2 withThuDay(String thuDay) {
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

    public Ssrmeet__2 withBeginTime(String beginTime) {
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

    public Ssrmeet__2 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("mtypCode")
    public String getMtypCode() {
        return mtypCode;
    }

    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("mtypCode")
    public void setMtypCode(String mtypCode) {
        this.mtypCode = mtypCode;
    }

    public Ssrmeet__2 withMtypCode(String mtypCode) {
        this.mtypCode = mtypCode;
        return this;
    }

    @JsonProperty("partDet")
    public String getPartDet() {
        return partDet;
    }

    @JsonProperty("partDet")
    public void setPartDet(String partDet) {
        this.partDet = partDet;
    }

    public Ssrmeet__2 withPartDet(String partDet) {
        this.partDet = partDet;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("bldgCode")
    public String getBldgCode() {
        return bldgCode;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("bldgCode")
    public void setBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
    }

    public Ssrmeet__2 withBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Ssrmeet__2 withStartDate(Date startDate) {
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

    public Ssrmeet__2 withMonDay(String monDay) {
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

    public Ssrmeet__2 withSatDay(String satDay) {
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

    public Ssrmeet__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrmeet__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("meetCode");
        sb.append('=');
        sb.append(((this.meetCode == null)?"<null>":this.meetCode));
        sb.append(',');
        sb.append("wedDay");
        sb.append('=');
        sb.append(((this.wedDay == null)?"<null>":this.wedDay));
        sb.append(',');
        sb.append("roomAttribDet");
        sb.append('=');
        sb.append(((this.roomAttribDet == null)?"<null>":this.roomAttribDet));
        sb.append(',');
        sb.append("tueDay");
        sb.append('=');
        sb.append(((this.tueDay == null)?"<null>":this.tueDay));
        sb.append(',');
        sb.append("roomCode");
        sb.append('=');
        sb.append(((this.roomCode == null)?"<null>":this.roomCode));
        sb.append(',');
        sb.append("creditHrSess");
        sb.append('=');
        sb.append(((this.creditHrSess == null)?"<null>":this.creditHrSess));
        sb.append(',');
        sb.append("catagory");
        sb.append('=');
        sb.append(((this.catagory == null)?"<null>":this.catagory));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sunDay");
        sb.append('=');
        sb.append(((this.sunDay == null)?"<null>":this.sunDay));
        sb.append(',');
        sb.append("hrsWeek");
        sb.append('=');
        sb.append(((this.hrsWeek == null)?"<null>":this.hrsWeek));
        sb.append(',');
        sb.append("schsCode");
        sb.append('=');
        sb.append(((this.schsCode == null)?"<null>":this.schsCode));
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
        sb.append("mtypCode");
        sb.append('=');
        sb.append(((this.mtypCode == null)?"<null>":this.mtypCode));
        sb.append(',');
        sb.append("partDet");
        sb.append('=');
        sb.append(((this.partDet == null)?"<null>":this.partDet));
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
        result = ((result* 31)+((this.meetCode == null)? 0 :this.meetCode.hashCode()));
        result = ((result* 31)+((this.roomAttribDet == null)? 0 :this.roomAttribDet.hashCode()));
        result = ((result* 31)+((this.roomCode == null)? 0 :this.roomCode.hashCode()));
        result = ((result* 31)+((this.creditHrSess == null)? 0 :this.creditHrSess.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.partDet == null)? 0 :this.partDet.hashCode()));
        result = ((result* 31)+((this.bldgCode == null)? 0 :this.bldgCode.hashCode()));
        result = ((result* 31)+((this.satDay == null)? 0 :this.satDay.hashCode()));
        result = ((result* 31)+((this.overRide == null)? 0 :this.overRide.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.catagory == null)? 0 :this.catagory.hashCode()));
        result = ((result* 31)+((this.hrsWeek == null)? 0 :this.hrsWeek.hashCode()));
        result = ((result* 31)+((this.schsCode == null)? 0 :this.schsCode.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mtypCode == null)? 0 :this.mtypCode.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.monDay == null)? 0 :this.monDay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrmeet__2) == false) {
            return false;
        }
        Ssrmeet__2 rhs = ((Ssrmeet__2) other);
        return (((((((((((((((((((((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.meetCode == rhs.meetCode)||((this.meetCode!= null)&&this.meetCode.equals(rhs.meetCode))))&&((this.roomAttribDet == rhs.roomAttribDet)||((this.roomAttribDet!= null)&&this.roomAttribDet.equals(rhs.roomAttribDet))))&&((this.roomCode == rhs.roomCode)||((this.roomCode!= null)&&this.roomCode.equals(rhs.roomCode))))&&((this.creditHrSess == rhs.creditHrSess)||((this.creditHrSess!= null)&&this.creditHrSess.equals(rhs.creditHrSess))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.partDet == rhs.partDet)||((this.partDet!= null)&&this.partDet.equals(rhs.partDet))))&&((this.bldgCode == rhs.bldgCode)||((this.bldgCode!= null)&&this.bldgCode.equals(rhs.bldgCode))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.catagory == rhs.catagory)||((this.catagory!= null)&&this.catagory.equals(rhs.catagory))))&&((this.hrsWeek == rhs.hrsWeek)||((this.hrsWeek!= null)&&this.hrsWeek.equals(rhs.hrsWeek))))&&((this.schsCode == rhs.schsCode)||((this.schsCode!= null)&&this.schsCode.equals(rhs.schsCode))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mtypCode == rhs.mtypCode)||((this.mtypCode!= null)&&this.mtypCode.equals(rhs.mtypCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))));
    }

}
