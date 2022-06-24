
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
    "criteria.catagory",
    "criteria.monDay",
    "endDate",
    "ssasectCrn",
    "criteria.endDate",
    "criteria.roomAttribDet",
    "criteria.startDate",
    "creditHrSess",
    "criteria.wedDay",
    "criteria.satDay",
    "schdCode",
    "criteria.roomCode",
    "beginTime",
    "rdefPrefNumber",
    "parsPrefNumber",
    "criteria.creditHrSess",
    "bldgCode",
    "satDay",
    "criteria.endTime",
    "criteria.ssrmrdfActivityDate",
    "criteria.rdefCode",
    "subjCode",
    "criteria.thuDay",
    "wedDay",
    "criteria.beginTime",
    "criteria.bldgCode",
    "rdefCode",
    "idno",
    "criteria.schdCode",
    "catagory",
    "criteria.partDet",
    "hrsWeek",
    "criteria.parsCode",
    "name",
    "thuDay",
    "friDay",
    "startDate",
    "percentSess",
    "criteria.friDay",
    "monDay",
    "percentResponse",
    "parsCode",
    "meetCode",
    "sirasgnOverRide",
    "roomCode",
    "criteria.parsPrefNumber",
    "sunDay",
    "criteria.rdefPrefNumber",
    "criteria.hrsWeek",
    "overRide",
    "tueDay",
    "criteria.meetCode",
    "criteria.schsCode",
    "criteria.mtypCode",
    "criteria.sunDay",
    "ssasectTermCode",
    "schsCode",
    "criteria.tueDay",
    "endTime",
    "mtypCode",
    "category",
    "criteria.ssrmprtActivityDate",
    "criteria.overRide",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class SectionMeetingTimes100PutRequest {

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * (Required)
     * 
     */
    @JsonProperty("criteria.catagory")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CATAGORY")
    private String criteriaCatagory;
    /**
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("criteria.monDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MON_DAY")
    private String criteriaMonDay;
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
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private String ssasectCrn;
    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_DATE")
    private Date criteriaEndDate;
    @JsonProperty("criteria.roomAttribDet")
    private String criteriaRoomAttribDet;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_START_DATE")
    private Date criteriaStartDate;
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
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("criteria.wedDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_WED_DAY")
    private String criteriaWedDay;
    /**
     * Lineage reference object : SSRMEET_SAT_DAY
     * 
     */
    @JsonProperty("criteria.satDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SAT_DAY")
    private String criteriaSatDay;
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
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("criteria.roomCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_ROOM_CODE")
    private String criteriaRoomCode;
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
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_PARS_PREF_NUMBER")
    private Double parsPrefNumber;
    /**
     * Session Credit Hours
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("criteria.creditHrSess")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CREDIT_HR_SESS")
    private Double criteriaCreditHrSess;
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
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("criteria.endTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_TIME")
    private String criteriaEndTime;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMRDF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssrmrdfActivityDate")
    @JsonPropertyDescription("Lineage reference object : SSRMRDF_ACTIVITY_DATE")
    private Date criteriaSsrmrdfActivityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("criteria.rdefCode")
    @JsonPropertyDescription("Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef")
    private String criteriaRdefCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Lineage reference object : SSRMEET_THU_DAY
     * 
     */
    @JsonProperty("criteria.thuDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_THU_DAY")
    private String criteriaThuDay;
    /**
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("wedDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_WED_DAY")
    private String wedDay;
    /**
     * Start Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.beginTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BEGIN_TIME")
    private String criteriaBeginTime;
    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("criteria.bldgCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg")
    private String criteriaBldgCode;
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
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    private String idno;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("criteria.schdCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd")
    private String criteriaSchdCode;
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
    @JsonProperty("criteria.partDet")
    private String criteriaPartDet;
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
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("criteria.parsCode")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars")
    private String criteriaParsCode;
    @JsonProperty("name")
    private String name;
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
     * Percent of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_SESS")
    private Double percentSess;
    /**
     * Lineage reference object : SSRMEET_FRI_DAY
     * 
     */
    @JsonProperty("criteria.friDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_FRI_DAY")
    private String criteriaFriDay;
    /**
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("monDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MON_DAY")
    private String monDay;
    /**
     * Percent of Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_RESPONSE")
    private Double percentResponse;
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
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("meetCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvmeet")
    private String meetCode;
    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("sirasgnOverRide")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_OVER_RIDE")
    private String sirasgnOverRide;
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
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("criteria.parsPrefNumber")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_PARS_PREF_NUMBER")
    private Double criteriaParsPrefNumber;
    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("sunDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SUN_DAY")
    private String sunDay;
    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("criteria.rdefPrefNumber")
    @JsonPropertyDescription("Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER")
    private Double criteriaRdefPrefNumber;
    /**
     * Hours per Week
     * <p>
     * Lineage reference object : SSRMEET_HRS_WEEK
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsWeek")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_HRS_WEEK")
    private Double criteriaHrsWeek;
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
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("tueDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_TUE_DAY")
    private String tueDay;
    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("criteria.meetCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvmeet")
    private String criteriaMeetCode;
    /**
     * Automatic Scheduler
     * <p>
     * Lineage reference object : SSRMEET_SCHS_CODE, Lookup lineage reference object : GTVSCHS
     * 
     */
    @JsonProperty("criteria.schsCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SCHS_CODE, Lookup lineage reference object : GTVSCHS")
    private String criteriaSchsCode;
    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("criteria.mtypCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp")
    private String criteriaMtypCode;
    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("criteria.sunDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SUN_DAY")
    private String criteriaSunDay;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private String ssasectTermCode;
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
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("criteria.tueDay")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_TUE_DAY")
    private String criteriaTueDay;
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
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_CATEGORY")
    private String category;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssrmprtActivityDate")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_ACTIVITY_DATE")
    private Date criteriaSsrmprtActivityDate;
    /**
     * Override Indicator
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.overRide")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_OVER_RIDE")
    private String criteriaOverRide;
    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * (Required)
     * 
     */
    @JsonProperty("criteria.catagory")
    public String getCriteriaCatagory() {
        return criteriaCatagory;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * (Required)
     * 
     */
    @JsonProperty("criteria.catagory")
    public void setCriteriaCatagory(String criteriaCatagory) {
        this.criteriaCatagory = criteriaCatagory;
    }

    public SectionMeetingTimes100PutRequest withCriteriaCatagory(String criteriaCatagory) {
        this.criteriaCatagory = criteriaCatagory;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("criteria.monDay")
    public String getCriteriaMonDay() {
        return criteriaMonDay;
    }

    /**
     * Lineage reference object : SSRMEET_MON_DAY
     * 
     */
    @JsonProperty("criteria.monDay")
    public void setCriteriaMonDay(String criteriaMonDay) {
        this.criteriaMonDay = criteriaMonDay;
    }

    public SectionMeetingTimes100PutRequest withCriteriaMonDay(String criteriaMonDay) {
        this.criteriaMonDay = criteriaMonDay;
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

    public SectionMeetingTimes100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public String getSsasectCrn() {
        return ssasectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public SectionMeetingTimes100PutRequest withSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public SectionMeetingTimes100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    @JsonProperty("criteria.roomAttribDet")
    public String getCriteriaRoomAttribDet() {
        return criteriaRoomAttribDet;
    }

    @JsonProperty("criteria.roomAttribDet")
    public void setCriteriaRoomAttribDet(String criteriaRoomAttribDet) {
        this.criteriaRoomAttribDet = criteriaRoomAttribDet;
    }

    public SectionMeetingTimes100PutRequest withCriteriaRoomAttribDet(String criteriaRoomAttribDet) {
        this.criteriaRoomAttribDet = criteriaRoomAttribDet;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public Date getCriteriaStartDate() {
        return criteriaStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public SectionMeetingTimes100PutRequest withCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
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

    public SectionMeetingTimes100PutRequest withCreditHrSess(Double creditHrSess) {
        this.creditHrSess = creditHrSess;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("criteria.wedDay")
    public String getCriteriaWedDay() {
        return criteriaWedDay;
    }

    /**
     * Lineage reference object : SSRMEET_WED_DAY
     * 
     */
    @JsonProperty("criteria.wedDay")
    public void setCriteriaWedDay(String criteriaWedDay) {
        this.criteriaWedDay = criteriaWedDay;
    }

    public SectionMeetingTimes100PutRequest withCriteriaWedDay(String criteriaWedDay) {
        this.criteriaWedDay = criteriaWedDay;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_SAT_DAY
     * 
     */
    @JsonProperty("criteria.satDay")
    public String getCriteriaSatDay() {
        return criteriaSatDay;
    }

    /**
     * Lineage reference object : SSRMEET_SAT_DAY
     * 
     */
    @JsonProperty("criteria.satDay")
    public void setCriteriaSatDay(String criteriaSatDay) {
        this.criteriaSatDay = criteriaSatDay;
    }

    public SectionMeetingTimes100PutRequest withCriteriaSatDay(String criteriaSatDay) {
        this.criteriaSatDay = criteriaSatDay;
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

    public SectionMeetingTimes100PutRequest withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("criteria.roomCode")
    public String getCriteriaRoomCode() {
        return criteriaRoomCode;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("criteria.roomCode")
    public void setCriteriaRoomCode(String criteriaRoomCode) {
        this.criteriaRoomCode = criteriaRoomCode;
    }

    public SectionMeetingTimes100PutRequest withCriteriaRoomCode(String criteriaRoomCode) {
        this.criteriaRoomCode = criteriaRoomCode;
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

    public SectionMeetingTimes100PutRequest withBeginTime(String beginTime) {
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

    public SectionMeetingTimes100PutRequest withRdefPrefNumber(Double rdefPrefNumber) {
        this.rdefPrefNumber = rdefPrefNumber;
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

    public SectionMeetingTimes100PutRequest withParsPrefNumber(Double parsPrefNumber) {
        this.parsPrefNumber = parsPrefNumber;
        return this;
    }

    /**
     * Session Credit Hours
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("criteria.creditHrSess")
    public Double getCriteriaCreditHrSess() {
        return criteriaCreditHrSess;
    }

    /**
     * Session Credit Hours
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("criteria.creditHrSess")
    public void setCriteriaCreditHrSess(Double criteriaCreditHrSess) {
        this.criteriaCreditHrSess = criteriaCreditHrSess;
    }

    public SectionMeetingTimes100PutRequest withCriteriaCreditHrSess(Double criteriaCreditHrSess) {
        this.criteriaCreditHrSess = criteriaCreditHrSess;
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

    public SectionMeetingTimes100PutRequest withBldgCode(String bldgCode) {
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

    public SectionMeetingTimes100PutRequest withSatDay(String satDay) {
        this.satDay = satDay;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("criteria.endTime")
    public String getCriteriaEndTime() {
        return criteriaEndTime;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("criteria.endTime")
    public void setCriteriaEndTime(String criteriaEndTime) {
        this.criteriaEndTime = criteriaEndTime;
    }

    public SectionMeetingTimes100PutRequest withCriteriaEndTime(String criteriaEndTime) {
        this.criteriaEndTime = criteriaEndTime;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMRDF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssrmrdfActivityDate")
    public Date getCriteriaSsrmrdfActivityDate() {
        return criteriaSsrmrdfActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMRDF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssrmrdfActivityDate")
    public void setCriteriaSsrmrdfActivityDate(Date criteriaSsrmrdfActivityDate) {
        this.criteriaSsrmrdfActivityDate = criteriaSsrmrdfActivityDate;
    }

    public SectionMeetingTimes100PutRequest withCriteriaSsrmrdfActivityDate(Date criteriaSsrmrdfActivityDate) {
        this.criteriaSsrmrdfActivityDate = criteriaSsrmrdfActivityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("criteria.rdefCode")
    public String getCriteriaRdefCode() {
        return criteriaRdefCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("criteria.rdefCode")
    public void setCriteriaRdefCode(String criteriaRdefCode) {
        this.criteriaRdefCode = criteriaRdefCode;
    }

    public SectionMeetingTimes100PutRequest withCriteriaRdefCode(String criteriaRdefCode) {
        this.criteriaRdefCode = criteriaRdefCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public SectionMeetingTimes100PutRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_THU_DAY
     * 
     */
    @JsonProperty("criteria.thuDay")
    public String getCriteriaThuDay() {
        return criteriaThuDay;
    }

    /**
     * Lineage reference object : SSRMEET_THU_DAY
     * 
     */
    @JsonProperty("criteria.thuDay")
    public void setCriteriaThuDay(String criteriaThuDay) {
        this.criteriaThuDay = criteriaThuDay;
    }

    public SectionMeetingTimes100PutRequest withCriteriaThuDay(String criteriaThuDay) {
        this.criteriaThuDay = criteriaThuDay;
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

    public SectionMeetingTimes100PutRequest withWedDay(String wedDay) {
        this.wedDay = wedDay;
        return this;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.beginTime")
    public String getCriteriaBeginTime() {
        return criteriaBeginTime;
    }

    /**
     * Start Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.beginTime")
    public void setCriteriaBeginTime(String criteriaBeginTime) {
        this.criteriaBeginTime = criteriaBeginTime;
    }

    public SectionMeetingTimes100PutRequest withCriteriaBeginTime(String criteriaBeginTime) {
        this.criteriaBeginTime = criteriaBeginTime;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("criteria.bldgCode")
    public String getCriteriaBldgCode() {
        return criteriaBldgCode;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("criteria.bldgCode")
    public void setCriteriaBldgCode(String criteriaBldgCode) {
        this.criteriaBldgCode = criteriaBldgCode;
    }

    public SectionMeetingTimes100PutRequest withCriteriaBldgCode(String criteriaBldgCode) {
        this.criteriaBldgCode = criteriaBldgCode;
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

    public SectionMeetingTimes100PutRequest withRdefCode(String rdefCode) {
        this.rdefCode = rdefCode;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    public String getIdno() {
        return idno;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    public void setIdno(String idno) {
        this.idno = idno;
    }

    public SectionMeetingTimes100PutRequest withIdno(String idno) {
        this.idno = idno;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("criteria.schdCode")
    public String getCriteriaSchdCode() {
        return criteriaSchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("criteria.schdCode")
    public void setCriteriaSchdCode(String criteriaSchdCode) {
        this.criteriaSchdCode = criteriaSchdCode;
    }

    public SectionMeetingTimes100PutRequest withCriteriaSchdCode(String criteriaSchdCode) {
        this.criteriaSchdCode = criteriaSchdCode;
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

    public SectionMeetingTimes100PutRequest withCatagory(String catagory) {
        this.catagory = catagory;
        return this;
    }

    @JsonProperty("criteria.partDet")
    public String getCriteriaPartDet() {
        return criteriaPartDet;
    }

    @JsonProperty("criteria.partDet")
    public void setCriteriaPartDet(String criteriaPartDet) {
        this.criteriaPartDet = criteriaPartDet;
    }

    public SectionMeetingTimes100PutRequest withCriteriaPartDet(String criteriaPartDet) {
        this.criteriaPartDet = criteriaPartDet;
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

    public SectionMeetingTimes100PutRequest withHrsWeek(Double hrsWeek) {
        this.hrsWeek = hrsWeek;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("criteria.parsCode")
    public String getCriteriaParsCode() {
        return criteriaParsCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("criteria.parsCode")
    public void setCriteriaParsCode(String criteriaParsCode) {
        this.criteriaParsCode = criteriaParsCode;
    }

    public SectionMeetingTimes100PutRequest withCriteriaParsCode(String criteriaParsCode) {
        this.criteriaParsCode = criteriaParsCode;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SectionMeetingTimes100PutRequest withName(String name) {
        this.name = name;
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

    public SectionMeetingTimes100PutRequest withThuDay(String thuDay) {
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

    public SectionMeetingTimes100PutRequest withFriDay(String friDay) {
        this.friDay = friDay;
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

    public SectionMeetingTimes100PutRequest withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Percent of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    public Double getPercentSess() {
        return percentSess;
    }

    /**
     * Percent of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    public void setPercentSess(Double percentSess) {
        this.percentSess = percentSess;
    }

    public SectionMeetingTimes100PutRequest withPercentSess(Double percentSess) {
        this.percentSess = percentSess;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_FRI_DAY
     * 
     */
    @JsonProperty("criteria.friDay")
    public String getCriteriaFriDay() {
        return criteriaFriDay;
    }

    /**
     * Lineage reference object : SSRMEET_FRI_DAY
     * 
     */
    @JsonProperty("criteria.friDay")
    public void setCriteriaFriDay(String criteriaFriDay) {
        this.criteriaFriDay = criteriaFriDay;
    }

    public SectionMeetingTimes100PutRequest withCriteriaFriDay(String criteriaFriDay) {
        this.criteriaFriDay = criteriaFriDay;
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

    public SectionMeetingTimes100PutRequest withMonDay(String monDay) {
        this.monDay = monDay;
        return this;
    }

    /**
     * Percent of Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    public Double getPercentResponse() {
        return percentResponse;
    }

    /**
     * Percent of Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    public void setPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
    }

    public SectionMeetingTimes100PutRequest withPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
        return this;
    }

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

    public SectionMeetingTimes100PutRequest withParsCode(String parsCode) {
        this.parsCode = parsCode;
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

    public SectionMeetingTimes100PutRequest withMeetCode(String meetCode) {
        this.meetCode = meetCode;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("sirasgnOverRide")
    public String getSirasgnOverRide() {
        return sirasgnOverRide;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("sirasgnOverRide")
    public void setSirasgnOverRide(String sirasgnOverRide) {
        this.sirasgnOverRide = sirasgnOverRide;
    }

    public SectionMeetingTimes100PutRequest withSirasgnOverRide(String sirasgnOverRide) {
        this.sirasgnOverRide = sirasgnOverRide;
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

    public SectionMeetingTimes100PutRequest withRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("criteria.parsPrefNumber")
    public Double getCriteriaParsPrefNumber() {
        return criteriaParsPrefNumber;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("criteria.parsPrefNumber")
    public void setCriteriaParsPrefNumber(Double criteriaParsPrefNumber) {
        this.criteriaParsPrefNumber = criteriaParsPrefNumber;
    }

    public SectionMeetingTimes100PutRequest withCriteriaParsPrefNumber(Double criteriaParsPrefNumber) {
        this.criteriaParsPrefNumber = criteriaParsPrefNumber;
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

    public SectionMeetingTimes100PutRequest withSunDay(String sunDay) {
        this.sunDay = sunDay;
        return this;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("criteria.rdefPrefNumber")
    public Double getCriteriaRdefPrefNumber() {
        return criteriaRdefPrefNumber;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("criteria.rdefPrefNumber")
    public void setCriteriaRdefPrefNumber(Double criteriaRdefPrefNumber) {
        this.criteriaRdefPrefNumber = criteriaRdefPrefNumber;
    }

    public SectionMeetingTimes100PutRequest withCriteriaRdefPrefNumber(Double criteriaRdefPrefNumber) {
        this.criteriaRdefPrefNumber = criteriaRdefPrefNumber;
        return this;
    }

    /**
     * Hours per Week
     * <p>
     * Lineage reference object : SSRMEET_HRS_WEEK
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsWeek")
    public Double getCriteriaHrsWeek() {
        return criteriaHrsWeek;
    }

    /**
     * Hours per Week
     * <p>
     * Lineage reference object : SSRMEET_HRS_WEEK
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrsWeek")
    public void setCriteriaHrsWeek(Double criteriaHrsWeek) {
        this.criteriaHrsWeek = criteriaHrsWeek;
    }

    public SectionMeetingTimes100PutRequest withCriteriaHrsWeek(Double criteriaHrsWeek) {
        this.criteriaHrsWeek = criteriaHrsWeek;
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

    public SectionMeetingTimes100PutRequest withOverRide(String overRide) {
        this.overRide = overRide;
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

    public SectionMeetingTimes100PutRequest withTueDay(String tueDay) {
        this.tueDay = tueDay;
        return this;
    }

    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("criteria.meetCode")
    public String getCriteriaMeetCode() {
        return criteriaMeetCode;
    }

    /**
     * Meeting Time
     * <p>
     * Lookup lineage reference object : stvmeet
     * 
     */
    @JsonProperty("criteria.meetCode")
    public void setCriteriaMeetCode(String criteriaMeetCode) {
        this.criteriaMeetCode = criteriaMeetCode;
    }

    public SectionMeetingTimes100PutRequest withCriteriaMeetCode(String criteriaMeetCode) {
        this.criteriaMeetCode = criteriaMeetCode;
        return this;
    }

    /**
     * Automatic Scheduler
     * <p>
     * Lineage reference object : SSRMEET_SCHS_CODE, Lookup lineage reference object : GTVSCHS
     * 
     */
    @JsonProperty("criteria.schsCode")
    public String getCriteriaSchsCode() {
        return criteriaSchsCode;
    }

    /**
     * Automatic Scheduler
     * <p>
     * Lineage reference object : SSRMEET_SCHS_CODE, Lookup lineage reference object : GTVSCHS
     * 
     */
    @JsonProperty("criteria.schsCode")
    public void setCriteriaSchsCode(String criteriaSchsCode) {
        this.criteriaSchsCode = criteriaSchsCode;
    }

    public SectionMeetingTimes100PutRequest withCriteriaSchsCode(String criteriaSchsCode) {
        this.criteriaSchsCode = criteriaSchsCode;
        return this;
    }

    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("criteria.mtypCode")
    public String getCriteriaMtypCode() {
        return criteriaMtypCode;
    }

    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("criteria.mtypCode")
    public void setCriteriaMtypCode(String criteriaMtypCode) {
        this.criteriaMtypCode = criteriaMtypCode;
    }

    public SectionMeetingTimes100PutRequest withCriteriaMtypCode(String criteriaMtypCode) {
        this.criteriaMtypCode = criteriaMtypCode;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("criteria.sunDay")
    public String getCriteriaSunDay() {
        return criteriaSunDay;
    }

    /**
     * Lineage reference object : SSRMEET_SUN_DAY
     * 
     */
    @JsonProperty("criteria.sunDay")
    public void setCriteriaSunDay(String criteriaSunDay) {
        this.criteriaSunDay = criteriaSunDay;
    }

    public SectionMeetingTimes100PutRequest withCriteriaSunDay(String criteriaSunDay) {
        this.criteriaSunDay = criteriaSunDay;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    public String getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public SectionMeetingTimes100PutRequest withSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
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

    public SectionMeetingTimes100PutRequest withSchsCode(String schsCode) {
        this.schsCode = schsCode;
        return this;
    }

    /**
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("criteria.tueDay")
    public String getCriteriaTueDay() {
        return criteriaTueDay;
    }

    /**
     * Lineage reference object : SSRMEET_TUE_DAY
     * 
     */
    @JsonProperty("criteria.tueDay")
    public void setCriteriaTueDay(String criteriaTueDay) {
        this.criteriaTueDay = criteriaTueDay;
    }

    public SectionMeetingTimes100PutRequest withCriteriaTueDay(String criteriaTueDay) {
        this.criteriaTueDay = criteriaTueDay;
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

    public SectionMeetingTimes100PutRequest withEndTime(String endTime) {
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

    public SectionMeetingTimes100PutRequest withMtypCode(String mtypCode) {
        this.mtypCode = mtypCode;
        return this;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public SectionMeetingTimes100PutRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssrmprtActivityDate")
    public Date getCriteriaSsrmprtActivityDate() {
        return criteriaSsrmprtActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssrmprtActivityDate")
    public void setCriteriaSsrmprtActivityDate(Date criteriaSsrmprtActivityDate) {
        this.criteriaSsrmprtActivityDate = criteriaSsrmprtActivityDate;
    }

    public SectionMeetingTimes100PutRequest withCriteriaSsrmprtActivityDate(Date criteriaSsrmprtActivityDate) {
        this.criteriaSsrmprtActivityDate = criteriaSsrmprtActivityDate;
        return this;
    }

    /**
     * Override Indicator
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.overRide")
    public String getCriteriaOverRide() {
        return criteriaOverRide;
    }

    /**
     * Override Indicator
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.overRide")
    public void setCriteriaOverRide(String criteriaOverRide) {
        this.criteriaOverRide = criteriaOverRide;
    }

    public SectionMeetingTimes100PutRequest withCriteriaOverRide(String criteriaOverRide) {
        this.criteriaOverRide = criteriaOverRide;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public SectionMeetingTimes100PutRequest withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
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

    public SectionMeetingTimes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionMeetingTimes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCatagory");
        sb.append('=');
        sb.append(((this.criteriaCatagory == null)?"<null>":this.criteriaCatagory));
        sb.append(',');
        sb.append("criteriaMonDay");
        sb.append('=');
        sb.append(((this.criteriaMonDay == null)?"<null>":this.criteriaMonDay));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaRoomAttribDet");
        sb.append('=');
        sb.append(((this.criteriaRoomAttribDet == null)?"<null>":this.criteriaRoomAttribDet));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
        sb.append(',');
        sb.append("creditHrSess");
        sb.append('=');
        sb.append(((this.creditHrSess == null)?"<null>":this.creditHrSess));
        sb.append(',');
        sb.append("criteriaWedDay");
        sb.append('=');
        sb.append(((this.criteriaWedDay == null)?"<null>":this.criteriaWedDay));
        sb.append(',');
        sb.append("criteriaSatDay");
        sb.append('=');
        sb.append(((this.criteriaSatDay == null)?"<null>":this.criteriaSatDay));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("criteriaRoomCode");
        sb.append('=');
        sb.append(((this.criteriaRoomCode == null)?"<null>":this.criteriaRoomCode));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("rdefPrefNumber");
        sb.append('=');
        sb.append(((this.rdefPrefNumber == null)?"<null>":this.rdefPrefNumber));
        sb.append(',');
        sb.append("parsPrefNumber");
        sb.append('=');
        sb.append(((this.parsPrefNumber == null)?"<null>":this.parsPrefNumber));
        sb.append(',');
        sb.append("criteriaCreditHrSess");
        sb.append('=');
        sb.append(((this.criteriaCreditHrSess == null)?"<null>":this.criteriaCreditHrSess));
        sb.append(',');
        sb.append("bldgCode");
        sb.append('=');
        sb.append(((this.bldgCode == null)?"<null>":this.bldgCode));
        sb.append(',');
        sb.append("satDay");
        sb.append('=');
        sb.append(((this.satDay == null)?"<null>":this.satDay));
        sb.append(',');
        sb.append("criteriaEndTime");
        sb.append('=');
        sb.append(((this.criteriaEndTime == null)?"<null>":this.criteriaEndTime));
        sb.append(',');
        sb.append("criteriaSsrmrdfActivityDate");
        sb.append('=');
        sb.append(((this.criteriaSsrmrdfActivityDate == null)?"<null>":this.criteriaSsrmrdfActivityDate));
        sb.append(',');
        sb.append("criteriaRdefCode");
        sb.append('=');
        sb.append(((this.criteriaRdefCode == null)?"<null>":this.criteriaRdefCode));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("criteriaThuDay");
        sb.append('=');
        sb.append(((this.criteriaThuDay == null)?"<null>":this.criteriaThuDay));
        sb.append(',');
        sb.append("wedDay");
        sb.append('=');
        sb.append(((this.wedDay == null)?"<null>":this.wedDay));
        sb.append(',');
        sb.append("criteriaBeginTime");
        sb.append('=');
        sb.append(((this.criteriaBeginTime == null)?"<null>":this.criteriaBeginTime));
        sb.append(',');
        sb.append("criteriaBldgCode");
        sb.append('=');
        sb.append(((this.criteriaBldgCode == null)?"<null>":this.criteriaBldgCode));
        sb.append(',');
        sb.append("rdefCode");
        sb.append('=');
        sb.append(((this.rdefCode == null)?"<null>":this.rdefCode));
        sb.append(',');
        sb.append("idno");
        sb.append('=');
        sb.append(((this.idno == null)?"<null>":this.idno));
        sb.append(',');
        sb.append("criteriaSchdCode");
        sb.append('=');
        sb.append(((this.criteriaSchdCode == null)?"<null>":this.criteriaSchdCode));
        sb.append(',');
        sb.append("catagory");
        sb.append('=');
        sb.append(((this.catagory == null)?"<null>":this.catagory));
        sb.append(',');
        sb.append("criteriaPartDet");
        sb.append('=');
        sb.append(((this.criteriaPartDet == null)?"<null>":this.criteriaPartDet));
        sb.append(',');
        sb.append("hrsWeek");
        sb.append('=');
        sb.append(((this.hrsWeek == null)?"<null>":this.hrsWeek));
        sb.append(',');
        sb.append("criteriaParsCode");
        sb.append('=');
        sb.append(((this.criteriaParsCode == null)?"<null>":this.criteriaParsCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("thuDay");
        sb.append('=');
        sb.append(((this.thuDay == null)?"<null>":this.thuDay));
        sb.append(',');
        sb.append("friDay");
        sb.append('=');
        sb.append(((this.friDay == null)?"<null>":this.friDay));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("percentSess");
        sb.append('=');
        sb.append(((this.percentSess == null)?"<null>":this.percentSess));
        sb.append(',');
        sb.append("criteriaFriDay");
        sb.append('=');
        sb.append(((this.criteriaFriDay == null)?"<null>":this.criteriaFriDay));
        sb.append(',');
        sb.append("monDay");
        sb.append('=');
        sb.append(((this.monDay == null)?"<null>":this.monDay));
        sb.append(',');
        sb.append("percentResponse");
        sb.append('=');
        sb.append(((this.percentResponse == null)?"<null>":this.percentResponse));
        sb.append(',');
        sb.append("parsCode");
        sb.append('=');
        sb.append(((this.parsCode == null)?"<null>":this.parsCode));
        sb.append(',');
        sb.append("meetCode");
        sb.append('=');
        sb.append(((this.meetCode == null)?"<null>":this.meetCode));
        sb.append(',');
        sb.append("sirasgnOverRide");
        sb.append('=');
        sb.append(((this.sirasgnOverRide == null)?"<null>":this.sirasgnOverRide));
        sb.append(',');
        sb.append("roomCode");
        sb.append('=');
        sb.append(((this.roomCode == null)?"<null>":this.roomCode));
        sb.append(',');
        sb.append("criteriaParsPrefNumber");
        sb.append('=');
        sb.append(((this.criteriaParsPrefNumber == null)?"<null>":this.criteriaParsPrefNumber));
        sb.append(',');
        sb.append("sunDay");
        sb.append('=');
        sb.append(((this.sunDay == null)?"<null>":this.sunDay));
        sb.append(',');
        sb.append("criteriaRdefPrefNumber");
        sb.append('=');
        sb.append(((this.criteriaRdefPrefNumber == null)?"<null>":this.criteriaRdefPrefNumber));
        sb.append(',');
        sb.append("criteriaHrsWeek");
        sb.append('=');
        sb.append(((this.criteriaHrsWeek == null)?"<null>":this.criteriaHrsWeek));
        sb.append(',');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("tueDay");
        sb.append('=');
        sb.append(((this.tueDay == null)?"<null>":this.tueDay));
        sb.append(',');
        sb.append("criteriaMeetCode");
        sb.append('=');
        sb.append(((this.criteriaMeetCode == null)?"<null>":this.criteriaMeetCode));
        sb.append(',');
        sb.append("criteriaSchsCode");
        sb.append('=');
        sb.append(((this.criteriaSchsCode == null)?"<null>":this.criteriaSchsCode));
        sb.append(',');
        sb.append("criteriaMtypCode");
        sb.append('=');
        sb.append(((this.criteriaMtypCode == null)?"<null>":this.criteriaMtypCode));
        sb.append(',');
        sb.append("criteriaSunDay");
        sb.append('=');
        sb.append(((this.criteriaSunDay == null)?"<null>":this.criteriaSunDay));
        sb.append(',');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("schsCode");
        sb.append('=');
        sb.append(((this.schsCode == null)?"<null>":this.schsCode));
        sb.append(',');
        sb.append("criteriaTueDay");
        sb.append('=');
        sb.append(((this.criteriaTueDay == null)?"<null>":this.criteriaTueDay));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("mtypCode");
        sb.append('=');
        sb.append(((this.mtypCode == null)?"<null>":this.mtypCode));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("criteriaSsrmprtActivityDate");
        sb.append('=');
        sb.append(((this.criteriaSsrmprtActivityDate == null)?"<null>":this.criteriaSsrmprtActivityDate));
        sb.append(',');
        sb.append("criteriaOverRide");
        sb.append('=');
        sb.append(((this.criteriaOverRide == null)?"<null>":this.criteriaOverRide));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
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
        result = ((result* 31)+((this.criteriaParsPrefNumber == null)? 0 :this.criteriaParsPrefNumber.hashCode()));
        result = ((result* 31)+((this.criteriaSchsCode == null)? 0 :this.criteriaSchsCode.hashCode()));
        result = ((result* 31)+((this.criteriaRdefPrefNumber == null)? 0 :this.criteriaRdefPrefNumber.hashCode()));
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaSunDay == null)? 0 :this.criteriaSunDay.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmprtActivityDate == null)? 0 :this.criteriaSsrmprtActivityDate.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        result = ((result* 31)+((this.criteriaRoomCode == null)? 0 :this.criteriaRoomCode.hashCode()));
        result = ((result* 31)+((this.creditHrSess == null)? 0 :this.creditHrSess.hashCode()));
        result = ((result* 31)+((this.criteriaMeetCode == null)? 0 :this.criteriaMeetCode.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.criteriaCreditHrSess == null)? 0 :this.criteriaCreditHrSess.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.rdefPrefNumber == null)? 0 :this.rdefPrefNumber.hashCode()));
        result = ((result* 31)+((this.parsPrefNumber == null)? 0 :this.parsPrefNumber.hashCode()));
        result = ((result* 31)+((this.bldgCode == null)? 0 :this.bldgCode.hashCode()));
        result = ((result* 31)+((this.satDay == null)? 0 :this.satDay.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmrdfActivityDate == null)? 0 :this.criteriaSsrmrdfActivityDate.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.criteriaTueDay == null)? 0 :this.criteriaTueDay.hashCode()));
        result = ((result* 31)+((this.rdefCode == null)? 0 :this.rdefCode.hashCode()));
        result = ((result* 31)+((this.idno == null)? 0 :this.idno.hashCode()));
        result = ((result* 31)+((this.criteriaHrsWeek == null)? 0 :this.criteriaHrsWeek.hashCode()));
        result = ((result* 31)+((this.catagory == null)? 0 :this.catagory.hashCode()));
        result = ((result* 31)+((this.hrsWeek == null)? 0 :this.hrsWeek.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.criteriaOverRide == null)? 0 :this.criteriaOverRide.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.percentSess == null)? 0 :this.percentSess.hashCode()));
        result = ((result* 31)+((this.monDay == null)? 0 :this.monDay.hashCode()));
        result = ((result* 31)+((this.criteriaSatDay == null)? 0 :this.criteriaSatDay.hashCode()));
        result = ((result* 31)+((this.percentResponse == null)? 0 :this.percentResponse.hashCode()));
        result = ((result* 31)+((this.parsCode == null)? 0 :this.parsCode.hashCode()));
        result = ((result* 31)+((this.meetCode == null)? 0 :this.meetCode.hashCode()));
        result = ((result* 31)+((this.sirasgnOverRide == null)? 0 :this.sirasgnOverRide.hashCode()));
        result = ((result* 31)+((this.criteriaMtypCode == null)? 0 :this.criteriaMtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaRdefCode == null)? 0 :this.criteriaRdefCode.hashCode()));
        result = ((result* 31)+((this.criteriaSchdCode == null)? 0 :this.criteriaSchdCode.hashCode()));
        result = ((result* 31)+((this.roomCode == null)? 0 :this.roomCode.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.criteriaBldgCode == null)? 0 :this.criteriaBldgCode.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaPartDet == null)? 0 :this.criteriaPartDet.hashCode()));
        result = ((result* 31)+((this.overRide == null)? 0 :this.overRide.hashCode()));
        result = ((result* 31)+((this.criteriaBeginTime == null)? 0 :this.criteriaBeginTime.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.criteriaCatagory == null)? 0 :this.criteriaCatagory.hashCode()));
        result = ((result* 31)+((this.criteriaFriDay == null)? 0 :this.criteriaFriDay.hashCode()));
        result = ((result* 31)+((this.criteriaEndTime == null)? 0 :this.criteriaEndTime.hashCode()));
        result = ((result* 31)+((this.criteriaRoomAttribDet == null)? 0 :this.criteriaRoomAttribDet.hashCode()));
        result = ((result* 31)+((this.criteriaMonDay == null)? 0 :this.criteriaMonDay.hashCode()));
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.schsCode == null)? 0 :this.schsCode.hashCode()));
        result = ((result* 31)+((this.criteriaThuDay == null)? 0 :this.criteriaThuDay.hashCode()));
        result = ((result* 31)+((this.criteriaParsCode == null)? 0 :this.criteriaParsCode.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.mtypCode == null)? 0 :this.mtypCode.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.criteriaWedDay == null)? 0 :this.criteriaWedDay.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionMeetingTimes100PutRequest) == false) {
            return false;
        }
        SectionMeetingTimes100PutRequest rhs = ((SectionMeetingTimes100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaParsPrefNumber == rhs.criteriaParsPrefNumber)||((this.criteriaParsPrefNumber!= null)&&this.criteriaParsPrefNumber.equals(rhs.criteriaParsPrefNumber)))&&((this.criteriaSchsCode == rhs.criteriaSchsCode)||((this.criteriaSchsCode!= null)&&this.criteriaSchsCode.equals(rhs.criteriaSchsCode))))&&((this.criteriaRdefPrefNumber == rhs.criteriaRdefPrefNumber)||((this.criteriaRdefPrefNumber!= null)&&this.criteriaRdefPrefNumber.equals(rhs.criteriaRdefPrefNumber))))&&((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate))))&&((this.criteriaSunDay == rhs.criteriaSunDay)||((this.criteriaSunDay!= null)&&this.criteriaSunDay.equals(rhs.criteriaSunDay))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.criteriaSsrmprtActivityDate == rhs.criteriaSsrmprtActivityDate)||((this.criteriaSsrmprtActivityDate!= null)&&this.criteriaSsrmprtActivityDate.equals(rhs.criteriaSsrmprtActivityDate))))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))))&&((this.criteriaRoomCode == rhs.criteriaRoomCode)||((this.criteriaRoomCode!= null)&&this.criteriaRoomCode.equals(rhs.criteriaRoomCode))))&&((this.creditHrSess == rhs.creditHrSess)||((this.creditHrSess!= null)&&this.creditHrSess.equals(rhs.creditHrSess))))&&((this.criteriaMeetCode == rhs.criteriaMeetCode)||((this.criteriaMeetCode!= null)&&this.criteriaMeetCode.equals(rhs.criteriaMeetCode))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.criteriaCreditHrSess == rhs.criteriaCreditHrSess)||((this.criteriaCreditHrSess!= null)&&this.criteriaCreditHrSess.equals(rhs.criteriaCreditHrSess))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.rdefPrefNumber == rhs.rdefPrefNumber)||((this.rdefPrefNumber!= null)&&this.rdefPrefNumber.equals(rhs.rdefPrefNumber))))&&((this.parsPrefNumber == rhs.parsPrefNumber)||((this.parsPrefNumber!= null)&&this.parsPrefNumber.equals(rhs.parsPrefNumber))))&&((this.bldgCode == rhs.bldgCode)||((this.bldgCode!= null)&&this.bldgCode.equals(rhs.bldgCode))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.criteriaSsrmrdfActivityDate == rhs.criteriaSsrmrdfActivityDate)||((this.criteriaSsrmrdfActivityDate!= null)&&this.criteriaSsrmrdfActivityDate.equals(rhs.criteriaSsrmrdfActivityDate))))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.criteriaTueDay == rhs.criteriaTueDay)||((this.criteriaTueDay!= null)&&this.criteriaTueDay.equals(rhs.criteriaTueDay))))&&((this.rdefCode == rhs.rdefCode)||((this.rdefCode!= null)&&this.rdefCode.equals(rhs.rdefCode))))&&((this.idno == rhs.idno)||((this.idno!= null)&&this.idno.equals(rhs.idno))))&&((this.criteriaHrsWeek == rhs.criteriaHrsWeek)||((this.criteriaHrsWeek!= null)&&this.criteriaHrsWeek.equals(rhs.criteriaHrsWeek))))&&((this.catagory == rhs.catagory)||((this.catagory!= null)&&this.catagory.equals(rhs.catagory))))&&((this.hrsWeek == rhs.hrsWeek)||((this.hrsWeek!= null)&&this.hrsWeek.equals(rhs.hrsWeek))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.criteriaOverRide == rhs.criteriaOverRide)||((this.criteriaOverRide!= null)&&this.criteriaOverRide.equals(rhs.criteriaOverRide))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.percentSess == rhs.percentSess)||((this.percentSess!= null)&&this.percentSess.equals(rhs.percentSess))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))))&&((this.criteriaSatDay == rhs.criteriaSatDay)||((this.criteriaSatDay!= null)&&this.criteriaSatDay.equals(rhs.criteriaSatDay))))&&((this.percentResponse == rhs.percentResponse)||((this.percentResponse!= null)&&this.percentResponse.equals(rhs.percentResponse))))&&((this.parsCode == rhs.parsCode)||((this.parsCode!= null)&&this.parsCode.equals(rhs.parsCode))))&&((this.meetCode == rhs.meetCode)||((this.meetCode!= null)&&this.meetCode.equals(rhs.meetCode))))&&((this.sirasgnOverRide == rhs.sirasgnOverRide)||((this.sirasgnOverRide!= null)&&this.sirasgnOverRide.equals(rhs.sirasgnOverRide))))&&((this.criteriaMtypCode == rhs.criteriaMtypCode)||((this.criteriaMtypCode!= null)&&this.criteriaMtypCode.equals(rhs.criteriaMtypCode))))&&((this.criteriaRdefCode == rhs.criteriaRdefCode)||((this.criteriaRdefCode!= null)&&this.criteriaRdefCode.equals(rhs.criteriaRdefCode))))&&((this.criteriaSchdCode == rhs.criteriaSchdCode)||((this.criteriaSchdCode!= null)&&this.criteriaSchdCode.equals(rhs.criteriaSchdCode))))&&((this.roomCode == rhs.roomCode)||((this.roomCode!= null)&&this.roomCode.equals(rhs.roomCode))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.criteriaBldgCode == rhs.criteriaBldgCode)||((this.criteriaBldgCode!= null)&&this.criteriaBldgCode.equals(rhs.criteriaBldgCode))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.criteriaPartDet == rhs.criteriaPartDet)||((this.criteriaPartDet!= null)&&this.criteriaPartDet.equals(rhs.criteriaPartDet))))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.criteriaBeginTime == rhs.criteriaBeginTime)||((this.criteriaBeginTime!= null)&&this.criteriaBeginTime.equals(rhs.criteriaBeginTime))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.criteriaCatagory == rhs.criteriaCatagory)||((this.criteriaCatagory!= null)&&this.criteriaCatagory.equals(rhs.criteriaCatagory))))&&((this.criteriaFriDay == rhs.criteriaFriDay)||((this.criteriaFriDay!= null)&&this.criteriaFriDay.equals(rhs.criteriaFriDay))))&&((this.criteriaEndTime == rhs.criteriaEndTime)||((this.criteriaEndTime!= null)&&this.criteriaEndTime.equals(rhs.criteriaEndTime))))&&((this.criteriaRoomAttribDet == rhs.criteriaRoomAttribDet)||((this.criteriaRoomAttribDet!= null)&&this.criteriaRoomAttribDet.equals(rhs.criteriaRoomAttribDet))))&&((this.criteriaMonDay == rhs.criteriaMonDay)||((this.criteriaMonDay!= null)&&this.criteriaMonDay.equals(rhs.criteriaMonDay))))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.schsCode == rhs.schsCode)||((this.schsCode!= null)&&this.schsCode.equals(rhs.schsCode))))&&((this.criteriaThuDay == rhs.criteriaThuDay)||((this.criteriaThuDay!= null)&&this.criteriaThuDay.equals(rhs.criteriaThuDay))))&&((this.criteriaParsCode == rhs.criteriaParsCode)||((this.criteriaParsCode!= null)&&this.criteriaParsCode.equals(rhs.criteriaParsCode))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.mtypCode == rhs.mtypCode)||((this.mtypCode!= null)&&this.mtypCode.equals(rhs.mtypCode))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.criteriaWedDay == rhs.criteriaWedDay)||((this.criteriaWedDay!= null)&&this.criteriaWedDay.equals(rhs.criteriaWedDay))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
