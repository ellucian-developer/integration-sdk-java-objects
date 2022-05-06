
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
    "ssrmeetBeginTime",
    "ssrmeetRoomCode",
    "ssrmeetEndTime",
    "ssrmeetCreditHrSess",
    "ssrmeetStartDate",
    "ssrmeetOverRide",
    "meetDays",
    "ssrmeetEndDate",
    "ssrmeetBldgCode",
    "ssrmeetMtypCode",
    "ssrmeetCatagory",
    "ssrmeetSchdCode",
    "meetCrn",
    "meetInd"
})
@Generated("jsonschema2pojo")
public class Ssvxmtus {

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("ssrmeetBeginTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BEGIN_TIME")
    private String ssrmeetBeginTime;
    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("ssrmeetRoomCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_ROOM_CODE")
    private String ssrmeetRoomCode;
    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("ssrmeetEndTime")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_TIME")
    private String ssrmeetEndTime;
    /**
     * Session Credits
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("ssrmeetCreditHrSess")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CREDIT_HR_SESS")
    private Double ssrmeetCreditHrSess;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("ssrmeetStartDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_START_DATE")
    private Date ssrmeetStartDate;
    /**
     * Override
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("ssrmeetOverRide")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_OVER_RIDE")
    private String ssrmeetOverRide;
    /**
     * Days
     * <p>
     * 
     * 
     */
    @JsonProperty("meetDays")
    private String meetDays;
    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("ssrmeetEndDate")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_END_DATE")
    private Date ssrmeetEndDate;
    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("ssrmeetBldgCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg")
    private String ssrmeetBldgCode;
    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("ssrmeetMtypCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp")
    private String ssrmeetMtypCode;
    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("ssrmeetCatagory")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_CATAGORY")
    private String ssrmeetCatagory;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("ssrmeetSchdCode")
    @JsonPropertyDescription("Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String ssrmeetSchdCode;
    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("meetCrn")
    private String meetCrn;
    @JsonProperty("meetInd")
    private String meetInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("ssrmeetBeginTime")
    public String getSsrmeetBeginTime() {
        return ssrmeetBeginTime;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SSRMEET_BEGIN_TIME
     * 
     */
    @JsonProperty("ssrmeetBeginTime")
    public void setSsrmeetBeginTime(String ssrmeetBeginTime) {
        this.ssrmeetBeginTime = ssrmeetBeginTime;
    }

    public Ssvxmtus withSsrmeetBeginTime(String ssrmeetBeginTime) {
        this.ssrmeetBeginTime = ssrmeetBeginTime;
        return this;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("ssrmeetRoomCode")
    public String getSsrmeetRoomCode() {
        return ssrmeetRoomCode;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : SSRMEET_ROOM_CODE
     * 
     */
    @JsonProperty("ssrmeetRoomCode")
    public void setSsrmeetRoomCode(String ssrmeetRoomCode) {
        this.ssrmeetRoomCode = ssrmeetRoomCode;
    }

    public Ssvxmtus withSsrmeetRoomCode(String ssrmeetRoomCode) {
        this.ssrmeetRoomCode = ssrmeetRoomCode;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("ssrmeetEndTime")
    public String getSsrmeetEndTime() {
        return ssrmeetEndTime;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SSRMEET_END_TIME
     * 
     */
    @JsonProperty("ssrmeetEndTime")
    public void setSsrmeetEndTime(String ssrmeetEndTime) {
        this.ssrmeetEndTime = ssrmeetEndTime;
    }

    public Ssvxmtus withSsrmeetEndTime(String ssrmeetEndTime) {
        this.ssrmeetEndTime = ssrmeetEndTime;
        return this;
    }

    /**
     * Session Credits
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("ssrmeetCreditHrSess")
    public Double getSsrmeetCreditHrSess() {
        return ssrmeetCreditHrSess;
    }

    /**
     * Session Credits
     * <p>
     * Lineage reference object : SSRMEET_CREDIT_HR_SESS
     * 
     */
    @JsonProperty("ssrmeetCreditHrSess")
    public void setSsrmeetCreditHrSess(Double ssrmeetCreditHrSess) {
        this.ssrmeetCreditHrSess = ssrmeetCreditHrSess;
    }

    public Ssvxmtus withSsrmeetCreditHrSess(Double ssrmeetCreditHrSess) {
        this.ssrmeetCreditHrSess = ssrmeetCreditHrSess;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("ssrmeetStartDate")
    public Date getSsrmeetStartDate() {
        return ssrmeetStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SSRMEET_START_DATE
     * 
     */
    @JsonProperty("ssrmeetStartDate")
    public void setSsrmeetStartDate(Date ssrmeetStartDate) {
        this.ssrmeetStartDate = ssrmeetStartDate;
    }

    public Ssvxmtus withSsrmeetStartDate(Date ssrmeetStartDate) {
        this.ssrmeetStartDate = ssrmeetStartDate;
        return this;
    }

    /**
     * Override
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("ssrmeetOverRide")
    public String getSsrmeetOverRide() {
        return ssrmeetOverRide;
    }

    /**
     * Override
     * <p>
     * Lineage reference object : SSRMEET_OVER_RIDE
     * 
     */
    @JsonProperty("ssrmeetOverRide")
    public void setSsrmeetOverRide(String ssrmeetOverRide) {
        this.ssrmeetOverRide = ssrmeetOverRide;
    }

    public Ssvxmtus withSsrmeetOverRide(String ssrmeetOverRide) {
        this.ssrmeetOverRide = ssrmeetOverRide;
        return this;
    }

    /**
     * Days
     * <p>
     * 
     * 
     */
    @JsonProperty("meetDays")
    public String getMeetDays() {
        return meetDays;
    }

    /**
     * Days
     * <p>
     * 
     * 
     */
    @JsonProperty("meetDays")
    public void setMeetDays(String meetDays) {
        this.meetDays = meetDays;
    }

    public Ssvxmtus withMeetDays(String meetDays) {
        this.meetDays = meetDays;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("ssrmeetEndDate")
    public Date getSsrmeetEndDate() {
        return ssrmeetEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SSRMEET_END_DATE
     * 
     */
    @JsonProperty("ssrmeetEndDate")
    public void setSsrmeetEndDate(Date ssrmeetEndDate) {
        this.ssrmeetEndDate = ssrmeetEndDate;
    }

    public Ssvxmtus withSsrmeetEndDate(Date ssrmeetEndDate) {
        this.ssrmeetEndDate = ssrmeetEndDate;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("ssrmeetBldgCode")
    public String getSsrmeetBldgCode() {
        return ssrmeetBldgCode;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SSRMEET_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("ssrmeetBldgCode")
    public void setSsrmeetBldgCode(String ssrmeetBldgCode) {
        this.ssrmeetBldgCode = ssrmeetBldgCode;
    }

    public Ssvxmtus withSsrmeetBldgCode(String ssrmeetBldgCode) {
        this.ssrmeetBldgCode = ssrmeetBldgCode;
        return this;
    }

    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("ssrmeetMtypCode")
    public String getSsrmeetMtypCode() {
        return ssrmeetMtypCode;
    }

    /**
     * Meeting Type
     * <p>
     * Lineage reference object : SSRMEET_MTYP_CODE, Lookup lineage reference object : gtvmtyp
     * 
     */
    @JsonProperty("ssrmeetMtypCode")
    public void setSsrmeetMtypCode(String ssrmeetMtypCode) {
        this.ssrmeetMtypCode = ssrmeetMtypCode;
    }

    public Ssvxmtus withSsrmeetMtypCode(String ssrmeetMtypCode) {
        this.ssrmeetMtypCode = ssrmeetMtypCode;
        return this;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("ssrmeetCatagory")
    public String getSsrmeetCatagory() {
        return ssrmeetCatagory;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SSRMEET_CATAGORY
     * 
     */
    @JsonProperty("ssrmeetCatagory")
    public void setSsrmeetCatagory(String ssrmeetCatagory) {
        this.ssrmeetCatagory = ssrmeetCatagory;
    }

    public Ssvxmtus withSsrmeetCatagory(String ssrmeetCatagory) {
        this.ssrmeetCatagory = ssrmeetCatagory;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("ssrmeetSchdCode")
    public String getSsrmeetSchdCode() {
        return ssrmeetSchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSRMEET_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("ssrmeetSchdCode")
    public void setSsrmeetSchdCode(String ssrmeetSchdCode) {
        this.ssrmeetSchdCode = ssrmeetSchdCode;
    }

    public Ssvxmtus withSsrmeetSchdCode(String ssrmeetSchdCode) {
        this.ssrmeetSchdCode = ssrmeetSchdCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("meetCrn")
    public String getMeetCrn() {
        return meetCrn;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("meetCrn")
    public void setMeetCrn(String meetCrn) {
        this.meetCrn = meetCrn;
    }

    public Ssvxmtus withMeetCrn(String meetCrn) {
        this.meetCrn = meetCrn;
        return this;
    }

    @JsonProperty("meetInd")
    public String getMeetInd() {
        return meetInd;
    }

    @JsonProperty("meetInd")
    public void setMeetInd(String meetInd) {
        this.meetInd = meetInd;
    }

    public Ssvxmtus withMeetInd(String meetInd) {
        this.meetInd = meetInd;
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

    public Ssvxmtus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssvxmtus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrmeetBeginTime");
        sb.append('=');
        sb.append(((this.ssrmeetBeginTime == null)?"<null>":this.ssrmeetBeginTime));
        sb.append(',');
        sb.append("ssrmeetRoomCode");
        sb.append('=');
        sb.append(((this.ssrmeetRoomCode == null)?"<null>":this.ssrmeetRoomCode));
        sb.append(',');
        sb.append("ssrmeetEndTime");
        sb.append('=');
        sb.append(((this.ssrmeetEndTime == null)?"<null>":this.ssrmeetEndTime));
        sb.append(',');
        sb.append("ssrmeetCreditHrSess");
        sb.append('=');
        sb.append(((this.ssrmeetCreditHrSess == null)?"<null>":this.ssrmeetCreditHrSess));
        sb.append(',');
        sb.append("ssrmeetStartDate");
        sb.append('=');
        sb.append(((this.ssrmeetStartDate == null)?"<null>":this.ssrmeetStartDate));
        sb.append(',');
        sb.append("ssrmeetOverRide");
        sb.append('=');
        sb.append(((this.ssrmeetOverRide == null)?"<null>":this.ssrmeetOverRide));
        sb.append(',');
        sb.append("meetDays");
        sb.append('=');
        sb.append(((this.meetDays == null)?"<null>":this.meetDays));
        sb.append(',');
        sb.append("ssrmeetEndDate");
        sb.append('=');
        sb.append(((this.ssrmeetEndDate == null)?"<null>":this.ssrmeetEndDate));
        sb.append(',');
        sb.append("ssrmeetBldgCode");
        sb.append('=');
        sb.append(((this.ssrmeetBldgCode == null)?"<null>":this.ssrmeetBldgCode));
        sb.append(',');
        sb.append("ssrmeetMtypCode");
        sb.append('=');
        sb.append(((this.ssrmeetMtypCode == null)?"<null>":this.ssrmeetMtypCode));
        sb.append(',');
        sb.append("ssrmeetCatagory");
        sb.append('=');
        sb.append(((this.ssrmeetCatagory == null)?"<null>":this.ssrmeetCatagory));
        sb.append(',');
        sb.append("ssrmeetSchdCode");
        sb.append('=');
        sb.append(((this.ssrmeetSchdCode == null)?"<null>":this.ssrmeetSchdCode));
        sb.append(',');
        sb.append("meetCrn");
        sb.append('=');
        sb.append(((this.meetCrn == null)?"<null>":this.meetCrn));
        sb.append(',');
        sb.append("meetInd");
        sb.append('=');
        sb.append(((this.meetInd == null)?"<null>":this.meetInd));
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
        result = ((result* 31)+((this.ssrmeetBeginTime == null)? 0 :this.ssrmeetBeginTime.hashCode()));
        result = ((result* 31)+((this.ssrmeetRoomCode == null)? 0 :this.ssrmeetRoomCode.hashCode()));
        result = ((result* 31)+((this.ssrmeetEndTime == null)? 0 :this.ssrmeetEndTime.hashCode()));
        result = ((result* 31)+((this.ssrmeetCreditHrSess == null)? 0 :this.ssrmeetCreditHrSess.hashCode()));
        result = ((result* 31)+((this.ssrmeetStartDate == null)? 0 :this.ssrmeetStartDate.hashCode()));
        result = ((result* 31)+((this.ssrmeetOverRide == null)? 0 :this.ssrmeetOverRide.hashCode()));
        result = ((result* 31)+((this.meetDays == null)? 0 :this.meetDays.hashCode()));
        result = ((result* 31)+((this.ssrmeetEndDate == null)? 0 :this.ssrmeetEndDate.hashCode()));
        result = ((result* 31)+((this.ssrmeetBldgCode == null)? 0 :this.ssrmeetBldgCode.hashCode()));
        result = ((result* 31)+((this.ssrmeetMtypCode == null)? 0 :this.ssrmeetMtypCode.hashCode()));
        result = ((result* 31)+((this.ssrmeetCatagory == null)? 0 :this.ssrmeetCatagory.hashCode()));
        result = ((result* 31)+((this.ssrmeetSchdCode == null)? 0 :this.ssrmeetSchdCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.meetCrn == null)? 0 :this.meetCrn.hashCode()));
        result = ((result* 31)+((this.meetInd == null)? 0 :this.meetInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssvxmtus) == false) {
            return false;
        }
        Ssvxmtus rhs = ((Ssvxmtus) other);
        return ((((((((((((((((this.ssrmeetBeginTime == rhs.ssrmeetBeginTime)||((this.ssrmeetBeginTime!= null)&&this.ssrmeetBeginTime.equals(rhs.ssrmeetBeginTime)))&&((this.ssrmeetRoomCode == rhs.ssrmeetRoomCode)||((this.ssrmeetRoomCode!= null)&&this.ssrmeetRoomCode.equals(rhs.ssrmeetRoomCode))))&&((this.ssrmeetEndTime == rhs.ssrmeetEndTime)||((this.ssrmeetEndTime!= null)&&this.ssrmeetEndTime.equals(rhs.ssrmeetEndTime))))&&((this.ssrmeetCreditHrSess == rhs.ssrmeetCreditHrSess)||((this.ssrmeetCreditHrSess!= null)&&this.ssrmeetCreditHrSess.equals(rhs.ssrmeetCreditHrSess))))&&((this.ssrmeetStartDate == rhs.ssrmeetStartDate)||((this.ssrmeetStartDate!= null)&&this.ssrmeetStartDate.equals(rhs.ssrmeetStartDate))))&&((this.ssrmeetOverRide == rhs.ssrmeetOverRide)||((this.ssrmeetOverRide!= null)&&this.ssrmeetOverRide.equals(rhs.ssrmeetOverRide))))&&((this.meetDays == rhs.meetDays)||((this.meetDays!= null)&&this.meetDays.equals(rhs.meetDays))))&&((this.ssrmeetEndDate == rhs.ssrmeetEndDate)||((this.ssrmeetEndDate!= null)&&this.ssrmeetEndDate.equals(rhs.ssrmeetEndDate))))&&((this.ssrmeetBldgCode == rhs.ssrmeetBldgCode)||((this.ssrmeetBldgCode!= null)&&this.ssrmeetBldgCode.equals(rhs.ssrmeetBldgCode))))&&((this.ssrmeetMtypCode == rhs.ssrmeetMtypCode)||((this.ssrmeetMtypCode!= null)&&this.ssrmeetMtypCode.equals(rhs.ssrmeetMtypCode))))&&((this.ssrmeetCatagory == rhs.ssrmeetCatagory)||((this.ssrmeetCatagory!= null)&&this.ssrmeetCatagory.equals(rhs.ssrmeetCatagory))))&&((this.ssrmeetSchdCode == rhs.ssrmeetSchdCode)||((this.ssrmeetSchdCode!= null)&&this.ssrmeetSchdCode.equals(rhs.ssrmeetSchdCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.meetCrn == rhs.meetCrn)||((this.meetCrn!= null)&&this.meetCrn.equals(rhs.meetCrn))))&&((this.meetInd == rhs.meetInd)||((this.meetInd!= null)&&this.meetInd.equals(rhs.meetInd))));
    }

}
