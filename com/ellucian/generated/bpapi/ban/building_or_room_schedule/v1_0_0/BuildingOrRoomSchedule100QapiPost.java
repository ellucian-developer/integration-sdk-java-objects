
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
    "bldgCode",
    "roomCode",
    "slbbldgCampCode",
    "monDay",
    "tueDay",
    "wedDay",
    "daysDisp",
    "timeDisp",
    "thuDay",
    "friDay",
    "satDay",
    "sunDay",
    "beginTime",
    "endTime",
    "termCode",
    "dateDisp",
    "startDate",
    "endDate",
    "ssbsectSubjCode",
    "ssbsectCrseNumb",
    "crn",
    "ssrxlstXlstGroup",
    "funcCode"
})
@Generated("jsonschema2pojo")
public class BuildingOrRoomSchedule100QapiPost {

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
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("roomCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_ROOM_CODE")
    private String roomCode;
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
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MON_DAY")
    private String monDay;
    /**
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_TUE_DAY")
    private String tueDay;
    /**
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_WED_DAY")
    private String wedDay;
    @JsonProperty("daysDisp")
    private String daysDisp;
    @JsonProperty("timeDisp")
    private String timeDisp;
    /**
     * Lineage reference object : SSRMEET_THU_DAY
     * 
     */
    @JsonProperty("thuDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_THU_DAY")
    private String thuDay;
    /**
     * Lineage reference object : SSRMEET_FRI_DAY
     * 
     */
    @JsonProperty("friDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_FRI_DAY")
    private String friDay;
    /**
     * Lineage reference object : SSRMEET_SAT_DAY
     * 
     */
    @JsonProperty("satDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SAT_DAY")
    private String satDay;
    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SUN_DAY")
    private String sunDay;
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
     * Term
     * <p>
     * Lineage reference object : SSRMEET_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonProperty("dateDisp")
    private String dateDisp;
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
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_DATE")
    private Date endDate;
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
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String ssbsectCrseNumb;
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
     * Cross List
     * <p>
     * Lineage reference object : SSRXLST_XLST_GROUP
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    @JsonPropertyDescription("Lineage reference object : SSRXLST_XLST_GROUP")
    private String ssrxlstXlstGroup;
    /**
     * Function
     * <p>
     * Lineage reference object : SSRMEET_FUNC_CODE, Lookup lineage reference object : gtvfunc
     * 
     */
    @JsonProperty("funcCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_FUNC_CODE, Lookup lineage reference object : gtvfunc")
    private String funcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public BuildingOrRoomSchedule100QapiPost withBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
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

    public BuildingOrRoomSchedule100QapiPost withRoomCode(String roomCode) {
        this.roomCode = roomCode;
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

    public BuildingOrRoomSchedule100QapiPost withSlbbldgCampCode(String slbbldgCampCode) {
        this.slbbldgCampCode = slbbldgCampCode;
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

    public BuildingOrRoomSchedule100QapiPost withMonDay(String monDay) {
        this.monDay = monDay;
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

    public BuildingOrRoomSchedule100QapiPost withTueDay(String tueDay) {
        this.tueDay = tueDay;
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

    public BuildingOrRoomSchedule100QapiPost withWedDay(String wedDay) {
        this.wedDay = wedDay;
        return this;
    }

    @JsonProperty("daysDisp")
    public String getDaysDisp() {
        return daysDisp;
    }

    @JsonProperty("daysDisp")
    public void setDaysDisp(String daysDisp) {
        this.daysDisp = daysDisp;
    }

    public BuildingOrRoomSchedule100QapiPost withDaysDisp(String daysDisp) {
        this.daysDisp = daysDisp;
        return this;
    }

    @JsonProperty("timeDisp")
    public String getTimeDisp() {
        return timeDisp;
    }

    @JsonProperty("timeDisp")
    public void setTimeDisp(String timeDisp) {
        this.timeDisp = timeDisp;
    }

    public BuildingOrRoomSchedule100QapiPost withTimeDisp(String timeDisp) {
        this.timeDisp = timeDisp;
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

    public BuildingOrRoomSchedule100QapiPost withThuDay(String thuDay) {
        this.thuDay = thuDay;
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

    public BuildingOrRoomSchedule100QapiPost withFriDay(String friDay) {
        this.friDay = friDay;
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

    public BuildingOrRoomSchedule100QapiPost withSatDay(String satDay) {
        this.satDay = satDay;
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

    public BuildingOrRoomSchedule100QapiPost withSunDay(String sunDay) {
        this.sunDay = sunDay;
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

    public BuildingOrRoomSchedule100QapiPost withBeginTime(String beginTime) {
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

    public BuildingOrRoomSchedule100QapiPost withEndTime(String endTime) {
        this.endTime = endTime;
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

    public BuildingOrRoomSchedule100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("dateDisp")
    public String getDateDisp() {
        return dateDisp;
    }

    @JsonProperty("dateDisp")
    public void setDateDisp(String dateDisp) {
        this.dateDisp = dateDisp;
    }

    public BuildingOrRoomSchedule100QapiPost withDateDisp(String dateDisp) {
        this.dateDisp = dateDisp;
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

    public BuildingOrRoomSchedule100QapiPost withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

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

    public BuildingOrRoomSchedule100QapiPost withEndDate(Date endDate) {
        this.endDate = endDate;
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

    public BuildingOrRoomSchedule100QapiPost withSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
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

    public BuildingOrRoomSchedule100QapiPost withSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
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

    public BuildingOrRoomSchedule100QapiPost withCrn(String crn) {
        this.crn = crn;
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

    public BuildingOrRoomSchedule100QapiPost withSsrxlstXlstGroup(String ssrxlstXlstGroup) {
        this.ssrxlstXlstGroup = ssrxlstXlstGroup;
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

    public BuildingOrRoomSchedule100QapiPost withFuncCode(String funcCode) {
        this.funcCode = funcCode;
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

    public BuildingOrRoomSchedule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildingOrRoomSchedule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bldgCode");
        sb.append('=');
        sb.append(((this.bldgCode == null)?"<null>":this.bldgCode));
        sb.append(',');
        sb.append("roomCode");
        sb.append('=');
        sb.append(((this.roomCode == null)?"<null>":this.roomCode));
        sb.append(',');
        sb.append("slbbldgCampCode");
        sb.append('=');
        sb.append(((this.slbbldgCampCode == null)?"<null>":this.slbbldgCampCode));
        sb.append(',');
        sb.append("monDay");
        sb.append('=');
        sb.append(((this.monDay == null)?"<null>":this.monDay));
        sb.append(',');
        sb.append("tueDay");
        sb.append('=');
        sb.append(((this.tueDay == null)?"<null>":this.tueDay));
        sb.append(',');
        sb.append("wedDay");
        sb.append('=');
        sb.append(((this.wedDay == null)?"<null>":this.wedDay));
        sb.append(',');
        sb.append("daysDisp");
        sb.append('=');
        sb.append(((this.daysDisp == null)?"<null>":this.daysDisp));
        sb.append(',');
        sb.append("timeDisp");
        sb.append('=');
        sb.append(((this.timeDisp == null)?"<null>":this.timeDisp));
        sb.append(',');
        sb.append("thuDay");
        sb.append('=');
        sb.append(((this.thuDay == null)?"<null>":this.thuDay));
        sb.append(',');
        sb.append("friDay");
        sb.append('=');
        sb.append(((this.friDay == null)?"<null>":this.friDay));
        sb.append(',');
        sb.append("satDay");
        sb.append('=');
        sb.append(((this.satDay == null)?"<null>":this.satDay));
        sb.append(',');
        sb.append("sunDay");
        sb.append('=');
        sb.append(((this.sunDay == null)?"<null>":this.sunDay));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("dateDisp");
        sb.append('=');
        sb.append(((this.dateDisp == null)?"<null>":this.dateDisp));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("ssbsectCrseNumb");
        sb.append('=');
        sb.append(((this.ssbsectCrseNumb == null)?"<null>":this.ssbsectCrseNumb));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("ssrxlstXlstGroup");
        sb.append('=');
        sb.append(((this.ssrxlstXlstGroup == null)?"<null>":this.ssrxlstXlstGroup));
        sb.append(',');
        sb.append("funcCode");
        sb.append('=');
        sb.append(((this.funcCode == null)?"<null>":this.funcCode));
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
        result = ((result* 31)+((this.roomCode == null)? 0 :this.roomCode.hashCode()));
        result = ((result* 31)+((this.ssbsectCrseNumb == null)? 0 :this.ssbsectCrseNumb.hashCode()));
        result = ((result* 31)+((this.slbbldgCampCode == null)? 0 :this.slbbldgCampCode.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.bldgCode == null)? 0 :this.bldgCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.satDay == null)? 0 :this.satDay.hashCode()));
        result = ((result* 31)+((this.dateDisp == null)? 0 :this.dateDisp.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.funcCode == null)? 0 :this.funcCode.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.timeDisp == null)? 0 :this.timeDisp.hashCode()));
        result = ((result* 31)+((this.ssbsectSubjCode == null)? 0 :this.ssbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.daysDisp == null)? 0 :this.daysDisp.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.ssrxlstXlstGroup == null)? 0 :this.ssrxlstXlstGroup.hashCode()));
        result = ((result* 31)+((this.monDay == null)? 0 :this.monDay.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuildingOrRoomSchedule100QapiPost) == false) {
            return false;
        }
        BuildingOrRoomSchedule100QapiPost rhs = ((BuildingOrRoomSchedule100QapiPost) other);
        return (((((((((((((((((((((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.roomCode == rhs.roomCode)||((this.roomCode!= null)&&this.roomCode.equals(rhs.roomCode))))&&((this.ssbsectCrseNumb == rhs.ssbsectCrseNumb)||((this.ssbsectCrseNumb!= null)&&this.ssbsectCrseNumb.equals(rhs.ssbsectCrseNumb))))&&((this.slbbldgCampCode == rhs.slbbldgCampCode)||((this.slbbldgCampCode!= null)&&this.slbbldgCampCode.equals(rhs.slbbldgCampCode))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.bldgCode == rhs.bldgCode)||((this.bldgCode!= null)&&this.bldgCode.equals(rhs.bldgCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))))&&((this.dateDisp == rhs.dateDisp)||((this.dateDisp!= null)&&this.dateDisp.equals(rhs.dateDisp))))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.funcCode == rhs.funcCode)||((this.funcCode!= null)&&this.funcCode.equals(rhs.funcCode))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.timeDisp == rhs.timeDisp)||((this.timeDisp!= null)&&this.timeDisp.equals(rhs.timeDisp))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.daysDisp == rhs.daysDisp)||((this.daysDisp!= null)&&this.daysDisp.equals(rhs.daysDisp))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.ssrxlstXlstGroup == rhs.ssrxlstXlstGroup)||((this.ssrxlstXlstGroup!= null)&&this.ssrxlstXlstGroup.equals(rhs.ssrxlstXlstGroup))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
