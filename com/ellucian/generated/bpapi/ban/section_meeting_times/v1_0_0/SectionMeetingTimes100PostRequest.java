
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
    "parsCode",
    "endDate",
    "roomCode",
    "creditHrSess",
    "schdCode",
    "sunDay",
    "beginTime",
    "rdefPrefNumber",
    "ssrmeetMeetCode",
    "parsPrefNumber",
    "crn",
    "bldgCode",
    "satDay",
    "overRide",
    "wedDay",
    "tueDay",
    "rdefCode",
    "catagory",
    "hrsWeek",
    "schsCode",
    "thuDay",
    "friDay",
    "endTime",
    "mtypCode",
    "startDate",
    "termCode",
    "monDay"
})
@Generated("jsonschema2pojo")
public class SectionMeetingTimes100PostRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars")
    private String parsCode;
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
     * Start Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BEGIN_TIME")
    private String beginTime;
    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("rdefPrefNumber")
    @JsonPropertyDescription("Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER")
    private Double rdefPrefNumber;
    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("ssrmeetMeetCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvmeet")
    private String ssrmeetMeetCode;
    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_PARS_PREF_NUMBER")
    private Double parsPrefNumber;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private Object crn;
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
     * Lineage reference object : SSRMEET_SAT_DAY
     * 
     */
    @JsonProperty("satDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SAT_DAY")
    private String satDay;
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
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("rdefCode")
    @JsonPropertyDescription("Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef")
    private String rdefCode;
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
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private Object termCode;
    /**
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MON_DAY")
    private String monDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    public String getParsCode() {
        return parsCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    public void setParsCode(String parsCode) {
        this.parsCode = parsCode;
    }

    public SectionMeetingTimes100PostRequest withParsCode(String parsCode) {
        this.parsCode = parsCode;
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

    public SectionMeetingTimes100PostRequest withEndDate(Date endDate) {
        this.endDate = endDate;
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

    public SectionMeetingTimes100PostRequest withRoomCode(String roomCode) {
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

    public SectionMeetingTimes100PostRequest withCreditHrSess(Double creditHrSess) {
        this.creditHrSess = creditHrSess;
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

    public SectionMeetingTimes100PostRequest withSchdCode(String schdCode) {
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

    public SectionMeetingTimes100PostRequest withSunDay(String sunDay) {
        this.sunDay = sunDay;
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

    public SectionMeetingTimes100PostRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("rdefPrefNumber")
    public Double getRdefPrefNumber() {
        return rdefPrefNumber;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("rdefPrefNumber")
    public void setRdefPrefNumber(Double rdefPrefNumber) {
        this.rdefPrefNumber = rdefPrefNumber;
    }

    public SectionMeetingTimes100PostRequest withRdefPrefNumber(Double rdefPrefNumber) {
        this.rdefPrefNumber = rdefPrefNumber;
        return this;
    }

    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("ssrmeetMeetCode")
    public String getSsrmeetMeetCode() {
        return ssrmeetMeetCode;
    }

    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("ssrmeetMeetCode")
    public void setSsrmeetMeetCode(String ssrmeetMeetCode) {
        this.ssrmeetMeetCode = ssrmeetMeetCode;
    }

    public SectionMeetingTimes100PostRequest withSsrmeetMeetCode(String ssrmeetMeetCode) {
        this.ssrmeetMeetCode = ssrmeetMeetCode;
        return this;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    public Double getParsPrefNumber() {
        return parsPrefNumber;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    public void setParsPrefNumber(Double parsPrefNumber) {
        this.parsPrefNumber = parsPrefNumber;
    }

    public SectionMeetingTimes100PostRequest withParsPrefNumber(Double parsPrefNumber) {
        this.parsPrefNumber = parsPrefNumber;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public Object getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public void setCrn(Object crn) {
        this.crn = crn;
    }

    public SectionMeetingTimes100PostRequest withCrn(Object crn) {
        this.crn = crn;
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

    public SectionMeetingTimes100PostRequest withBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
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

    public SectionMeetingTimes100PostRequest withSatDay(String satDay) {
        this.satDay = satDay;
        return this;
    }

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

    public SectionMeetingTimes100PostRequest withOverRide(String overRide) {
        this.overRide = overRide;
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

    public SectionMeetingTimes100PostRequest withWedDay(String wedDay) {
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

    public SectionMeetingTimes100PostRequest withTueDay(String tueDay) {
        this.tueDay = tueDay;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("rdefCode")
    public String getRdefCode() {
        return rdefCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("rdefCode")
    public void setRdefCode(String rdefCode) {
        this.rdefCode = rdefCode;
    }

    public SectionMeetingTimes100PostRequest withRdefCode(String rdefCode) {
        this.rdefCode = rdefCode;
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

    public SectionMeetingTimes100PostRequest withCatagory(String catagory) {
        this.catagory = catagory;
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

    public SectionMeetingTimes100PostRequest withHrsWeek(Double hrsWeek) {
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

    public SectionMeetingTimes100PostRequest withSchsCode(String schsCode) {
        this.schsCode = schsCode;
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

    public SectionMeetingTimes100PostRequest withThuDay(String thuDay) {
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

    public SectionMeetingTimes100PostRequest withFriDay(String friDay) {
        this.friDay = friDay;
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

    public SectionMeetingTimes100PostRequest withEndTime(String endTime) {
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

    public SectionMeetingTimes100PostRequest withMtypCode(String mtypCode) {
        this.mtypCode = mtypCode;
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

    public SectionMeetingTimes100PostRequest withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public Object getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(Object termCode) {
        this.termCode = termCode;
    }

    public SectionMeetingTimes100PostRequest withTermCode(Object termCode) {
        this.termCode = termCode;
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

    public SectionMeetingTimes100PostRequest withMonDay(String monDay) {
        this.monDay = monDay;
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

    public SectionMeetingTimes100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionMeetingTimes100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parsCode");
        sb.append('=');
        sb.append(((this.parsCode == null)?"<null>":this.parsCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("roomCode");
        sb.append('=');
        sb.append(((this.roomCode == null)?"<null>":this.roomCode));
        sb.append(',');
        sb.append("creditHrSess");
        sb.append('=');
        sb.append(((this.creditHrSess == null)?"<null>":this.creditHrSess));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sunDay");
        sb.append('=');
        sb.append(((this.sunDay == null)?"<null>":this.sunDay));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("rdefPrefNumber");
        sb.append('=');
        sb.append(((this.rdefPrefNumber == null)?"<null>":this.rdefPrefNumber));
        sb.append(',');
        sb.append("ssrmeetMeetCode");
        sb.append('=');
        sb.append(((this.ssrmeetMeetCode == null)?"<null>":this.ssrmeetMeetCode));
        sb.append(',');
        sb.append("parsPrefNumber");
        sb.append('=');
        sb.append(((this.parsPrefNumber == null)?"<null>":this.parsPrefNumber));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("bldgCode");
        sb.append('=');
        sb.append(((this.bldgCode == null)?"<null>":this.bldgCode));
        sb.append(',');
        sb.append("satDay");
        sb.append('=');
        sb.append(((this.satDay == null)?"<null>":this.satDay));
        sb.append(',');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("wedDay");
        sb.append('=');
        sb.append(((this.wedDay == null)?"<null>":this.wedDay));
        sb.append(',');
        sb.append("tueDay");
        sb.append('=');
        sb.append(((this.tueDay == null)?"<null>":this.tueDay));
        sb.append(',');
        sb.append("rdefCode");
        sb.append('=');
        sb.append(((this.rdefCode == null)?"<null>":this.rdefCode));
        sb.append(',');
        sb.append("catagory");
        sb.append('=');
        sb.append(((this.catagory == null)?"<null>":this.catagory));
        sb.append(',');
        sb.append("hrsWeek");
        sb.append('=');
        sb.append(((this.hrsWeek == null)?"<null>":this.hrsWeek));
        sb.append(',');
        sb.append("schsCode");
        sb.append('=');
        sb.append(((this.schsCode == null)?"<null>":this.schsCode));
        sb.append(',');
        sb.append("thuDay");
        sb.append('=');
        sb.append(((this.thuDay == null)?"<null>":this.thuDay));
        sb.append(',');
        sb.append("friDay");
        sb.append('=');
        sb.append(((this.friDay == null)?"<null>":this.friDay));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("mtypCode");
        sb.append('=');
        sb.append(((this.mtypCode == null)?"<null>":this.mtypCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("monDay");
        sb.append('=');
        sb.append(((this.monDay == null)?"<null>":this.monDay));
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
        result = ((result* 31)+((this.parsCode == null)? 0 :this.parsCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.roomCode == null)? 0 :this.roomCode.hashCode()));
        result = ((result* 31)+((this.creditHrSess == null)? 0 :this.creditHrSess.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.rdefPrefNumber == null)? 0 :this.rdefPrefNumber.hashCode()));
        result = ((result* 31)+((this.ssrmeetMeetCode == null)? 0 :this.ssrmeetMeetCode.hashCode()));
        result = ((result* 31)+((this.parsPrefNumber == null)? 0 :this.parsPrefNumber.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.bldgCode == null)? 0 :this.bldgCode.hashCode()));
        result = ((result* 31)+((this.satDay == null)? 0 :this.satDay.hashCode()));
        result = ((result* 31)+((this.overRide == null)? 0 :this.overRide.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.rdefCode == null)? 0 :this.rdefCode.hashCode()));
        result = ((result* 31)+((this.catagory == null)? 0 :this.catagory.hashCode()));
        result = ((result* 31)+((this.hrsWeek == null)? 0 :this.hrsWeek.hashCode()));
        result = ((result* 31)+((this.schsCode == null)? 0 :this.schsCode.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mtypCode == null)? 0 :this.mtypCode.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.monDay == null)? 0 :this.monDay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionMeetingTimes100PostRequest) == false) {
            return false;
        }
        SectionMeetingTimes100PostRequest rhs = ((SectionMeetingTimes100PostRequest) other);
        return (((((((((((((((((((((((((((((this.parsCode == rhs.parsCode)||((this.parsCode!= null)&&this.parsCode.equals(rhs.parsCode)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.roomCode == rhs.roomCode)||((this.roomCode!= null)&&this.roomCode.equals(rhs.roomCode))))&&((this.creditHrSess == rhs.creditHrSess)||((this.creditHrSess!= null)&&this.creditHrSess.equals(rhs.creditHrSess))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.rdefPrefNumber == rhs.rdefPrefNumber)||((this.rdefPrefNumber!= null)&&this.rdefPrefNumber.equals(rhs.rdefPrefNumber))))&&((this.ssrmeetMeetCode == rhs.ssrmeetMeetCode)||((this.ssrmeetMeetCode!= null)&&this.ssrmeetMeetCode.equals(rhs.ssrmeetMeetCode))))&&((this.parsPrefNumber == rhs.parsPrefNumber)||((this.parsPrefNumber!= null)&&this.parsPrefNumber.equals(rhs.parsPrefNumber))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.bldgCode == rhs.bldgCode)||((this.bldgCode!= null)&&this.bldgCode.equals(rhs.bldgCode))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.rdefCode == rhs.rdefCode)||((this.rdefCode!= null)&&this.rdefCode.equals(rhs.rdefCode))))&&((this.catagory == rhs.catagory)||((this.catagory!= null)&&this.catagory.equals(rhs.catagory))))&&((this.hrsWeek == rhs.hrsWeek)||((this.hrsWeek!= null)&&this.hrsWeek.equals(rhs.hrsWeek))))&&((this.schsCode == rhs.schsCode)||((this.schsCode!= null)&&this.schsCode.equals(rhs.schsCode))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mtypCode == rhs.mtypCode)||((this.mtypCode!= null)&&this.mtypCode.equals(rhs.mtypCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))));
    }

}
