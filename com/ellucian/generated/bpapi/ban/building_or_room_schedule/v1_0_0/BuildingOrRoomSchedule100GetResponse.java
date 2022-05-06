
package com.ellucian.generated.bpapi.ban.building_or_room_schedule.v1_0_0;

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
    "funcCode",
    "wedDay",
    "tueDay",
    "ssbsectSubjCode",
    "roomCode",
    "ssbsectCrseNumb",
    "slbbldgCampCode",
    "sunDay",
    "friDay",
    "thuDay",
    "beginTime",
    "endTime",
    "bldgCode",
    "crn",
    "startDate",
    "ssrxlstXlstGroup",
    "monDay",
    "satDay",
    "termCode"
})
@Generated("jsonschema2pojo")
public class BuildingOrRoomSchedule100GetResponse {

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
     * Function
     * <p>
     * Lineage reference object : SSRMEET_FUNC_CODE, Lookup lineage reference object : gtvfunc
     * 
     */
    @JsonProperty("funcCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_FUNC_CODE, Lookup lineage reference object : gtvfunc")
    private String funcCode;
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
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String ssbsectSubjCode;
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
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String ssbsectCrseNumb;
    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("slbbldgCampCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String slbbldgCampCode;
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
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("bldgCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg")
    private String bldgCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSRMEET_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CRN")
    private String crn;
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
     * Cross List
     * <p>
     * Lineage reference object : SSRXLST_XLST_GROUP
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    @JsonPropertyDescription("Lineage reference object : SSRXLST_XLST_GROUP")
    private String ssrxlstXlstGroup;
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
    /**
     * Term
     * <p>
     * Lineage reference object : SSRMEET_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
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

    public BuildingOrRoomSchedule100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Function
     * <p>
     * Lineage reference object : SSRMEET_FUNC_CODE, Lookup lineage reference object : gtvfunc
     * 
     */
    @JsonProperty("funcCode")
    public String getFuncCode() {
        return funcCode;
    }

    /**
     * Function
     * <p>
     * Lineage reference object : SSRMEET_FUNC_CODE, Lookup lineage reference object : gtvfunc
     * 
     */
    @JsonProperty("funcCode")
    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    public BuildingOrRoomSchedule100GetResponse withFuncCode(String funcCode) {
        this.funcCode = funcCode;
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

    public BuildingOrRoomSchedule100GetResponse withWedDay(String wedDay) {
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

    public BuildingOrRoomSchedule100GetResponse withTueDay(String tueDay) {
        this.tueDay = tueDay;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public String getSsbsectSubjCode() {
        return ssbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public void setSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
    }

    public BuildingOrRoomSchedule100GetResponse withSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
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

    public BuildingOrRoomSchedule100GetResponse withRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public String getSsbsectCrseNumb() {
        return ssbsectCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public void setSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
    }

    public BuildingOrRoomSchedule100GetResponse withSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("slbbldgCampCode")
    public String getSlbbldgCampCode() {
        return slbbldgCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("slbbldgCampCode")
    public void setSlbbldgCampCode(String slbbldgCampCode) {
        this.slbbldgCampCode = slbbldgCampCode;
    }

    public BuildingOrRoomSchedule100GetResponse withSlbbldgCampCode(String slbbldgCampCode) {
        this.slbbldgCampCode = slbbldgCampCode;
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

    public BuildingOrRoomSchedule100GetResponse withSunDay(String sunDay) {
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

    public BuildingOrRoomSchedule100GetResponse withFriDay(String friDay) {
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

    public BuildingOrRoomSchedule100GetResponse withThuDay(String thuDay) {
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

    public BuildingOrRoomSchedule100GetResponse withBeginTime(String beginTime) {
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

    public BuildingOrRoomSchedule100GetResponse withEndTime(String endTime) {
        this.endTime = endTime;
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

    public BuildingOrRoomSchedule100GetResponse withBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRMEET_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRMEET_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public BuildingOrRoomSchedule100GetResponse withCrn(String crn) {
        this.crn = crn;
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

    public BuildingOrRoomSchedule100GetResponse withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Cross List
     * <p>
     * Lineage reference object : SSRXLST_XLST_GROUP
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    public String getSsrxlstXlstGroup() {
        return ssrxlstXlstGroup;
    }

    /**
     * Cross List
     * <p>
     * Lineage reference object : SSRXLST_XLST_GROUP
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    public void setSsrxlstXlstGroup(String ssrxlstXlstGroup) {
        this.ssrxlstXlstGroup = ssrxlstXlstGroup;
    }

    public BuildingOrRoomSchedule100GetResponse withSsrxlstXlstGroup(String ssrxlstXlstGroup) {
        this.ssrxlstXlstGroup = ssrxlstXlstGroup;
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

    public BuildingOrRoomSchedule100GetResponse withMonDay(String monDay) {
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

    public BuildingOrRoomSchedule100GetResponse withSatDay(String satDay) {
        this.satDay = satDay;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SSRMEET_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SSRMEET_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public BuildingOrRoomSchedule100GetResponse withTermCode(String termCode) {
        this.termCode = termCode;
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

    public BuildingOrRoomSchedule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildingOrRoomSchedule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("funcCode");
        sb.append('=');
        sb.append(((this.funcCode == null)?"<null>":this.funcCode));
        sb.append(',');
        sb.append("wedDay");
        sb.append('=');
        sb.append(((this.wedDay == null)?"<null>":this.wedDay));
        sb.append(',');
        sb.append("tueDay");
        sb.append('=');
        sb.append(((this.tueDay == null)?"<null>":this.tueDay));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("roomCode");
        sb.append('=');
        sb.append(((this.roomCode == null)?"<null>":this.roomCode));
        sb.append(',');
        sb.append("ssbsectCrseNumb");
        sb.append('=');
        sb.append(((this.ssbsectCrseNumb == null)?"<null>":this.ssbsectCrseNumb));
        sb.append(',');
        sb.append("slbbldgCampCode");
        sb.append('=');
        sb.append(((this.slbbldgCampCode == null)?"<null>":this.slbbldgCampCode));
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
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("ssrxlstXlstGroup");
        sb.append('=');
        sb.append(((this.ssrxlstXlstGroup == null)?"<null>":this.ssrxlstXlstGroup));
        sb.append(',');
        sb.append("monDay");
        sb.append('=');
        sb.append(((this.monDay == null)?"<null>":this.monDay));
        sb.append(',');
        sb.append("satDay");
        sb.append('=');
        sb.append(((this.satDay == null)?"<null>":this.satDay));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.funcCode == null)? 0 :this.funcCode.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.ssbsectSubjCode == null)? 0 :this.ssbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.roomCode == null)? 0 :this.roomCode.hashCode()));
        result = ((result* 31)+((this.ssbsectCrseNumb == null)? 0 :this.ssbsectCrseNumb.hashCode()));
        result = ((result* 31)+((this.slbbldgCampCode == null)? 0 :this.slbbldgCampCode.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bldgCode == null)? 0 :this.bldgCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.ssrxlstXlstGroup == null)? 0 :this.ssrxlstXlstGroup.hashCode()));
        result = ((result* 31)+((this.monDay == null)? 0 :this.monDay.hashCode()));
        result = ((result* 31)+((this.satDay == null)? 0 :this.satDay.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuildingOrRoomSchedule100GetResponse) == false) {
            return false;
        }
        BuildingOrRoomSchedule100GetResponse rhs = ((BuildingOrRoomSchedule100GetResponse) other);
        return ((((((((((((((((((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.funcCode == rhs.funcCode)||((this.funcCode!= null)&&this.funcCode.equals(rhs.funcCode))))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.roomCode == rhs.roomCode)||((this.roomCode!= null)&&this.roomCode.equals(rhs.roomCode))))&&((this.ssbsectCrseNumb == rhs.ssbsectCrseNumb)||((this.ssbsectCrseNumb!= null)&&this.ssbsectCrseNumb.equals(rhs.ssbsectCrseNumb))))&&((this.slbbldgCampCode == rhs.slbbldgCampCode)||((this.slbbldgCampCode!= null)&&this.slbbldgCampCode.equals(rhs.slbbldgCampCode))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bldgCode == rhs.bldgCode)||((this.bldgCode!= null)&&this.bldgCode.equals(rhs.bldgCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.ssrxlstXlstGroup == rhs.ssrxlstXlstGroup)||((this.ssrxlstXlstGroup!= null)&&this.ssrxlstXlstGroup.equals(rhs.ssrxlstXlstGroup))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
