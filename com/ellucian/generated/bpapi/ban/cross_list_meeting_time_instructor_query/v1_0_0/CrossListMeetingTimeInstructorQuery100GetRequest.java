
package com.ellucian.generated.bpapi.ban.cross_list_meeting_time_instructor_query.v1_0_0;

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
    "criteria.ssrmeetStartDate",
    "criteria.ssrmeetSchdCode",
    "criteria.ssrmeetCatagory",
    "criteria.meetCrn",
    "criteria.meetDays",
    "keyblocXlstGroup",
    "criteria.ssrmeetEndDate",
    "keyblocTermCode",
    "criteria.ssrmeetMtypCode",
    "criteria.ssrmeetBeginTime",
    "criteria.ssrmeetRoomCode",
    "criteria.ssrmeetCreditHrSess",
    "criteria.ssrmeetOverRide",
    "criteria.ssrmeetBldgCode",
    "criteria.ssrmeetEndTime"
})
@Generated("jsonschema2pojo")
public class CrossListMeetingTimeInstructorQuery100GetRequest {

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("criteria.ssrmeetStartDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_START_DATE")
    private Date criteriaSsrmeetStartDate;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.ssrmeetSchdCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String criteriaSsrmeetSchdCode;
    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("criteria.ssrmeetCatagory")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CATAGORY")
    private String criteriaSsrmeetCatagory;
    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.meetCrn")
    private String criteriaMeetCrn;
    /**
     * Days
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.meetDays")
    private String criteriaMeetDays;
    /**
     * Cross List Group Identifier
     * <p>
     * Lineage reference object : keyblocXlstGroup
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    @JsonPropertyDescription("Lineage reference object : keyblocXlstGroup")
    private String keyblocXlstGroup;
    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("criteria.ssrmeetEndDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_DATE")
    private Date criteriaSsrmeetEndDate;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("criteria.ssrmeetMtypCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp")
    private String criteriaSsrmeetMtypCode;
    /**
     * Begin Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.ssrmeetBeginTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BEGIN_TIME")
    private String criteriaSsrmeetBeginTime;
    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("criteria.ssrmeetRoomCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_ROOM_CODE")
    private String criteriaSsrmeetRoomCode;
    /**
     * Session Credits
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("criteria.ssrmeetCreditHrSess")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CREDIT_HR_SESS")
    private Double criteriaSsrmeetCreditHrSess;
    /**
     * Override
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.ssrmeetOverRide")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_OVER_RIDE")
    private String criteriaSsrmeetOverRide;
    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("criteria.ssrmeetBldgCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg")
    private String criteriaSsrmeetBldgCode;
    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("criteria.ssrmeetEndTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_TIME")
    private String criteriaSsrmeetEndTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("criteria.ssrmeetStartDate")
    public Date getCriteriaSsrmeetStartDate() {
        return criteriaSsrmeetStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("criteria.ssrmeetStartDate")
    public void setCriteriaSsrmeetStartDate(Date criteriaSsrmeetStartDate) {
        this.criteriaSsrmeetStartDate = criteriaSsrmeetStartDate;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetStartDate(Date criteriaSsrmeetStartDate) {
        this.criteriaSsrmeetStartDate = criteriaSsrmeetStartDate;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.ssrmeetSchdCode")
    public String getCriteriaSsrmeetSchdCode() {
        return criteriaSsrmeetSchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.ssrmeetSchdCode")
    public void setCriteriaSsrmeetSchdCode(String criteriaSsrmeetSchdCode) {
        this.criteriaSsrmeetSchdCode = criteriaSsrmeetSchdCode;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetSchdCode(String criteriaSsrmeetSchdCode) {
        this.criteriaSsrmeetSchdCode = criteriaSsrmeetSchdCode;
        return this;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("criteria.ssrmeetCatagory")
    public String getCriteriaSsrmeetCatagory() {
        return criteriaSsrmeetCatagory;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("criteria.ssrmeetCatagory")
    public void setCriteriaSsrmeetCatagory(String criteriaSsrmeetCatagory) {
        this.criteriaSsrmeetCatagory = criteriaSsrmeetCatagory;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetCatagory(String criteriaSsrmeetCatagory) {
        this.criteriaSsrmeetCatagory = criteriaSsrmeetCatagory;
        return this;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.meetCrn")
    public String getCriteriaMeetCrn() {
        return criteriaMeetCrn;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.meetCrn")
    public void setCriteriaMeetCrn(String criteriaMeetCrn) {
        this.criteriaMeetCrn = criteriaMeetCrn;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaMeetCrn(String criteriaMeetCrn) {
        this.criteriaMeetCrn = criteriaMeetCrn;
        return this;
    }

    /**
     * Days
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.meetDays")
    public String getCriteriaMeetDays() {
        return criteriaMeetDays;
    }

    /**
     * Days
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.meetDays")
    public void setCriteriaMeetDays(String criteriaMeetDays) {
        this.criteriaMeetDays = criteriaMeetDays;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaMeetDays(String criteriaMeetDays) {
        this.criteriaMeetDays = criteriaMeetDays;
        return this;
    }

    /**
     * Cross List Group Identifier
     * <p>
     * Lineage reference object : keyblocXlstGroup
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    public String getKeyblocXlstGroup() {
        return keyblocXlstGroup;
    }

    /**
     * Cross List Group Identifier
     * <p>
     * Lineage reference object : keyblocXlstGroup
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    public void setKeyblocXlstGroup(String keyblocXlstGroup) {
        this.keyblocXlstGroup = keyblocXlstGroup;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withKeyblocXlstGroup(String keyblocXlstGroup) {
        this.keyblocXlstGroup = keyblocXlstGroup;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("criteria.ssrmeetEndDate")
    public Date getCriteriaSsrmeetEndDate() {
        return criteriaSsrmeetEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("criteria.ssrmeetEndDate")
    public void setCriteriaSsrmeetEndDate(Date criteriaSsrmeetEndDate) {
        this.criteriaSsrmeetEndDate = criteriaSsrmeetEndDate;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetEndDate(Date criteriaSsrmeetEndDate) {
        this.criteriaSsrmeetEndDate = criteriaSsrmeetEndDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("criteria.ssrmeetMtypCode")
    public String getCriteriaSsrmeetMtypCode() {
        return criteriaSsrmeetMtypCode;
    }

    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("criteria.ssrmeetMtypCode")
    public void setCriteriaSsrmeetMtypCode(String criteriaSsrmeetMtypCode) {
        this.criteriaSsrmeetMtypCode = criteriaSsrmeetMtypCode;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetMtypCode(String criteriaSsrmeetMtypCode) {
        this.criteriaSsrmeetMtypCode = criteriaSsrmeetMtypCode;
        return this;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.ssrmeetBeginTime")
    public String getCriteriaSsrmeetBeginTime() {
        return criteriaSsrmeetBeginTime;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.ssrmeetBeginTime")
    public void setCriteriaSsrmeetBeginTime(String criteriaSsrmeetBeginTime) {
        this.criteriaSsrmeetBeginTime = criteriaSsrmeetBeginTime;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetBeginTime(String criteriaSsrmeetBeginTime) {
        this.criteriaSsrmeetBeginTime = criteriaSsrmeetBeginTime;
        return this;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("criteria.ssrmeetRoomCode")
    public String getCriteriaSsrmeetRoomCode() {
        return criteriaSsrmeetRoomCode;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("criteria.ssrmeetRoomCode")
    public void setCriteriaSsrmeetRoomCode(String criteriaSsrmeetRoomCode) {
        this.criteriaSsrmeetRoomCode = criteriaSsrmeetRoomCode;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetRoomCode(String criteriaSsrmeetRoomCode) {
        this.criteriaSsrmeetRoomCode = criteriaSsrmeetRoomCode;
        return this;
    }

    /**
     * Session Credits
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("criteria.ssrmeetCreditHrSess")
    public Double getCriteriaSsrmeetCreditHrSess() {
        return criteriaSsrmeetCreditHrSess;
    }

    /**
     * Session Credits
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("criteria.ssrmeetCreditHrSess")
    public void setCriteriaSsrmeetCreditHrSess(Double criteriaSsrmeetCreditHrSess) {
        this.criteriaSsrmeetCreditHrSess = criteriaSsrmeetCreditHrSess;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetCreditHrSess(Double criteriaSsrmeetCreditHrSess) {
        this.criteriaSsrmeetCreditHrSess = criteriaSsrmeetCreditHrSess;
        return this;
    }

    /**
     * Override
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.ssrmeetOverRide")
    public String getCriteriaSsrmeetOverRide() {
        return criteriaSsrmeetOverRide;
    }

    /**
     * Override
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("criteria.ssrmeetOverRide")
    public void setCriteriaSsrmeetOverRide(String criteriaSsrmeetOverRide) {
        this.criteriaSsrmeetOverRide = criteriaSsrmeetOverRide;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetOverRide(String criteriaSsrmeetOverRide) {
        this.criteriaSsrmeetOverRide = criteriaSsrmeetOverRide;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("criteria.ssrmeetBldgCode")
    public String getCriteriaSsrmeetBldgCode() {
        return criteriaSsrmeetBldgCode;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("criteria.ssrmeetBldgCode")
    public void setCriteriaSsrmeetBldgCode(String criteriaSsrmeetBldgCode) {
        this.criteriaSsrmeetBldgCode = criteriaSsrmeetBldgCode;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetBldgCode(String criteriaSsrmeetBldgCode) {
        this.criteriaSsrmeetBldgCode = criteriaSsrmeetBldgCode;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("criteria.ssrmeetEndTime")
    public String getCriteriaSsrmeetEndTime() {
        return criteriaSsrmeetEndTime;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("criteria.ssrmeetEndTime")
    public void setCriteriaSsrmeetEndTime(String criteriaSsrmeetEndTime) {
        this.criteriaSsrmeetEndTime = criteriaSsrmeetEndTime;
    }

    public CrossListMeetingTimeInstructorQuery100GetRequest withCriteriaSsrmeetEndTime(String criteriaSsrmeetEndTime) {
        this.criteriaSsrmeetEndTime = criteriaSsrmeetEndTime;
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

    public CrossListMeetingTimeInstructorQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CrossListMeetingTimeInstructorQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSsrmeetStartDate");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetStartDate == null)?"<null>":this.criteriaSsrmeetStartDate));
        sb.append(',');
        sb.append("criteriaSsrmeetSchdCode");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetSchdCode == null)?"<null>":this.criteriaSsrmeetSchdCode));
        sb.append(',');
        sb.append("criteriaSsrmeetCatagory");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetCatagory == null)?"<null>":this.criteriaSsrmeetCatagory));
        sb.append(',');
        sb.append("criteriaMeetCrn");
        sb.append('=');
        sb.append(((this.criteriaMeetCrn == null)?"<null>":this.criteriaMeetCrn));
        sb.append(',');
        sb.append("criteriaMeetDays");
        sb.append('=');
        sb.append(((this.criteriaMeetDays == null)?"<null>":this.criteriaMeetDays));
        sb.append(',');
        sb.append("keyblocXlstGroup");
        sb.append('=');
        sb.append(((this.keyblocXlstGroup == null)?"<null>":this.keyblocXlstGroup));
        sb.append(',');
        sb.append("criteriaSsrmeetEndDate");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetEndDate == null)?"<null>":this.criteriaSsrmeetEndDate));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("criteriaSsrmeetMtypCode");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetMtypCode == null)?"<null>":this.criteriaSsrmeetMtypCode));
        sb.append(',');
        sb.append("criteriaSsrmeetBeginTime");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetBeginTime == null)?"<null>":this.criteriaSsrmeetBeginTime));
        sb.append(',');
        sb.append("criteriaSsrmeetRoomCode");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetRoomCode == null)?"<null>":this.criteriaSsrmeetRoomCode));
        sb.append(',');
        sb.append("criteriaSsrmeetCreditHrSess");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetCreditHrSess == null)?"<null>":this.criteriaSsrmeetCreditHrSess));
        sb.append(',');
        sb.append("criteriaSsrmeetOverRide");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetOverRide == null)?"<null>":this.criteriaSsrmeetOverRide));
        sb.append(',');
        sb.append("criteriaSsrmeetBldgCode");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetBldgCode == null)?"<null>":this.criteriaSsrmeetBldgCode));
        sb.append(',');
        sb.append("criteriaSsrmeetEndTime");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetEndTime == null)?"<null>":this.criteriaSsrmeetEndTime));
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
        result = ((result* 31)+((this.criteriaMeetDays == null)? 0 :this.criteriaMeetDays.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetRoomCode == null)? 0 :this.criteriaSsrmeetRoomCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetCreditHrSess == null)? 0 :this.criteriaSsrmeetCreditHrSess.hashCode()));
        result = ((result* 31)+((this.keyblocXlstGroup == null)? 0 :this.keyblocXlstGroup.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetOverRide == null)? 0 :this.criteriaSsrmeetOverRide.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetEndTime == null)? 0 :this.criteriaSsrmeetEndTime.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetStartDate == null)? 0 :this.criteriaSsrmeetStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetBldgCode == null)? 0 :this.criteriaSsrmeetBldgCode.hashCode()));
        result = ((result* 31)+((this.criteriaMeetCrn == null)? 0 :this.criteriaMeetCrn.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetMtypCode == null)? 0 :this.criteriaSsrmeetMtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetEndDate == null)? 0 :this.criteriaSsrmeetEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetSchdCode == null)? 0 :this.criteriaSsrmeetSchdCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetBeginTime == null)? 0 :this.criteriaSsrmeetBeginTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetCatagory == null)? 0 :this.criteriaSsrmeetCatagory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrossListMeetingTimeInstructorQuery100GetRequest) == false) {
            return false;
        }
        CrossListMeetingTimeInstructorQuery100GetRequest rhs = ((CrossListMeetingTimeInstructorQuery100GetRequest) other);
        return (((((((((((((((((this.criteriaMeetDays == rhs.criteriaMeetDays)||((this.criteriaMeetDays!= null)&&this.criteriaMeetDays.equals(rhs.criteriaMeetDays)))&&((this.criteriaSsrmeetRoomCode == rhs.criteriaSsrmeetRoomCode)||((this.criteriaSsrmeetRoomCode!= null)&&this.criteriaSsrmeetRoomCode.equals(rhs.criteriaSsrmeetRoomCode))))&&((this.criteriaSsrmeetCreditHrSess == rhs.criteriaSsrmeetCreditHrSess)||((this.criteriaSsrmeetCreditHrSess!= null)&&this.criteriaSsrmeetCreditHrSess.equals(rhs.criteriaSsrmeetCreditHrSess))))&&((this.keyblocXlstGroup == rhs.keyblocXlstGroup)||((this.keyblocXlstGroup!= null)&&this.keyblocXlstGroup.equals(rhs.keyblocXlstGroup))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.criteriaSsrmeetOverRide == rhs.criteriaSsrmeetOverRide)||((this.criteriaSsrmeetOverRide!= null)&&this.criteriaSsrmeetOverRide.equals(rhs.criteriaSsrmeetOverRide))))&&((this.criteriaSsrmeetEndTime == rhs.criteriaSsrmeetEndTime)||((this.criteriaSsrmeetEndTime!= null)&&this.criteriaSsrmeetEndTime.equals(rhs.criteriaSsrmeetEndTime))))&&((this.criteriaSsrmeetStartDate == rhs.criteriaSsrmeetStartDate)||((this.criteriaSsrmeetStartDate!= null)&&this.criteriaSsrmeetStartDate.equals(rhs.criteriaSsrmeetStartDate))))&&((this.criteriaSsrmeetBldgCode == rhs.criteriaSsrmeetBldgCode)||((this.criteriaSsrmeetBldgCode!= null)&&this.criteriaSsrmeetBldgCode.equals(rhs.criteriaSsrmeetBldgCode))))&&((this.criteriaMeetCrn == rhs.criteriaMeetCrn)||((this.criteriaMeetCrn!= null)&&this.criteriaMeetCrn.equals(rhs.criteriaMeetCrn))))&&((this.criteriaSsrmeetMtypCode == rhs.criteriaSsrmeetMtypCode)||((this.criteriaSsrmeetMtypCode!= null)&&this.criteriaSsrmeetMtypCode.equals(rhs.criteriaSsrmeetMtypCode))))&&((this.criteriaSsrmeetEndDate == rhs.criteriaSsrmeetEndDate)||((this.criteriaSsrmeetEndDate!= null)&&this.criteriaSsrmeetEndDate.equals(rhs.criteriaSsrmeetEndDate))))&&((this.criteriaSsrmeetSchdCode == rhs.criteriaSsrmeetSchdCode)||((this.criteriaSsrmeetSchdCode!= null)&&this.criteriaSsrmeetSchdCode.equals(rhs.criteriaSsrmeetSchdCode))))&&((this.criteriaSsrmeetBeginTime == rhs.criteriaSsrmeetBeginTime)||((this.criteriaSsrmeetBeginTime!= null)&&this.criteriaSsrmeetBeginTime.equals(rhs.criteriaSsrmeetBeginTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSsrmeetCatagory == rhs.criteriaSsrmeetCatagory)||((this.criteriaSsrmeetCatagory!= null)&&this.criteriaSsrmeetCatagory.equals(rhs.criteriaSsrmeetCatagory))));
    }

}
