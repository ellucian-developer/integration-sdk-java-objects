
package com.ellucian.generated.bpapi.ban.cross_list_meeting_time_instructor_query.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyblocTermCode",
    "keyblocXlstGroup",
    "criteria.meetCrn",
    "criteria.ssrmeetStartDate",
    "criteria.ssrmeetEndDate",
    "criteria.ssrmeetMtypCode",
    "criteria.meetDays",
    "criteria.ssrmeetBeginTime",
    "criteria.ssrmeetEndTime",
    "criteria.ssrmeetBldgCode",
    "criteria.ssrmeetRoomCode",
    "criteria.ssrmeetSchdCode",
    "criteria.ssrmeetOverRide",
    "criteria.ssrmeetCreditHrSess",
    "criteria.ssrmeetCatagory"
})
@Generated("jsonschema2pojo")
public class CrossListMeetingTimeInstructorQuery100QapiPost {

    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("keyblocXlstGroup")
    private String keyblocXlstGroup;
    @JsonProperty("criteria.meetCrn")
    private String criteriaMeetCrn;
    @JsonProperty("criteria.ssrmeetStartDate")
    private String criteriaSsrmeetStartDate;
    @JsonProperty("criteria.ssrmeetEndDate")
    private String criteriaSsrmeetEndDate;
    @JsonProperty("criteria.ssrmeetMtypCode")
    private String criteriaSsrmeetMtypCode;
    @JsonProperty("criteria.meetDays")
    private String criteriaMeetDays;
    @JsonProperty("criteria.ssrmeetBeginTime")
    private String criteriaSsrmeetBeginTime;
    @JsonProperty("criteria.ssrmeetEndTime")
    private String criteriaSsrmeetEndTime;
    @JsonProperty("criteria.ssrmeetBldgCode")
    private String criteriaSsrmeetBldgCode;
    @JsonProperty("criteria.ssrmeetRoomCode")
    private String criteriaSsrmeetRoomCode;
    @JsonProperty("criteria.ssrmeetSchdCode")
    private String criteriaSsrmeetSchdCode;
    @JsonProperty("criteria.ssrmeetOverRide")
    private String criteriaSsrmeetOverRide;
    @JsonProperty("criteria.ssrmeetCreditHrSess")
    private String criteriaSsrmeetCreditHrSess;
    @JsonProperty("criteria.ssrmeetCatagory")
    private String criteriaSsrmeetCatagory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("keyblocXlstGroup")
    public String getKeyblocXlstGroup() {
        return keyblocXlstGroup;
    }

    @JsonProperty("keyblocXlstGroup")
    public void setKeyblocXlstGroup(String keyblocXlstGroup) {
        this.keyblocXlstGroup = keyblocXlstGroup;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withKeyblocXlstGroup(String keyblocXlstGroup) {
        this.keyblocXlstGroup = keyblocXlstGroup;
        return this;
    }

    @JsonProperty("criteria.meetCrn")
    public String getCriteriaMeetCrn() {
        return criteriaMeetCrn;
    }

    @JsonProperty("criteria.meetCrn")
    public void setCriteriaMeetCrn(String criteriaMeetCrn) {
        this.criteriaMeetCrn = criteriaMeetCrn;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaMeetCrn(String criteriaMeetCrn) {
        this.criteriaMeetCrn = criteriaMeetCrn;
        return this;
    }

    @JsonProperty("criteria.ssrmeetStartDate")
    public String getCriteriaSsrmeetStartDate() {
        return criteriaSsrmeetStartDate;
    }

    @JsonProperty("criteria.ssrmeetStartDate")
    public void setCriteriaSsrmeetStartDate(String criteriaSsrmeetStartDate) {
        this.criteriaSsrmeetStartDate = criteriaSsrmeetStartDate;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetStartDate(String criteriaSsrmeetStartDate) {
        this.criteriaSsrmeetStartDate = criteriaSsrmeetStartDate;
        return this;
    }

    @JsonProperty("criteria.ssrmeetEndDate")
    public String getCriteriaSsrmeetEndDate() {
        return criteriaSsrmeetEndDate;
    }

    @JsonProperty("criteria.ssrmeetEndDate")
    public void setCriteriaSsrmeetEndDate(String criteriaSsrmeetEndDate) {
        this.criteriaSsrmeetEndDate = criteriaSsrmeetEndDate;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetEndDate(String criteriaSsrmeetEndDate) {
        this.criteriaSsrmeetEndDate = criteriaSsrmeetEndDate;
        return this;
    }

    @JsonProperty("criteria.ssrmeetMtypCode")
    public String getCriteriaSsrmeetMtypCode() {
        return criteriaSsrmeetMtypCode;
    }

    @JsonProperty("criteria.ssrmeetMtypCode")
    public void setCriteriaSsrmeetMtypCode(String criteriaSsrmeetMtypCode) {
        this.criteriaSsrmeetMtypCode = criteriaSsrmeetMtypCode;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetMtypCode(String criteriaSsrmeetMtypCode) {
        this.criteriaSsrmeetMtypCode = criteriaSsrmeetMtypCode;
        return this;
    }

    @JsonProperty("criteria.meetDays")
    public String getCriteriaMeetDays() {
        return criteriaMeetDays;
    }

    @JsonProperty("criteria.meetDays")
    public void setCriteriaMeetDays(String criteriaMeetDays) {
        this.criteriaMeetDays = criteriaMeetDays;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaMeetDays(String criteriaMeetDays) {
        this.criteriaMeetDays = criteriaMeetDays;
        return this;
    }

    @JsonProperty("criteria.ssrmeetBeginTime")
    public String getCriteriaSsrmeetBeginTime() {
        return criteriaSsrmeetBeginTime;
    }

    @JsonProperty("criteria.ssrmeetBeginTime")
    public void setCriteriaSsrmeetBeginTime(String criteriaSsrmeetBeginTime) {
        this.criteriaSsrmeetBeginTime = criteriaSsrmeetBeginTime;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetBeginTime(String criteriaSsrmeetBeginTime) {
        this.criteriaSsrmeetBeginTime = criteriaSsrmeetBeginTime;
        return this;
    }

    @JsonProperty("criteria.ssrmeetEndTime")
    public String getCriteriaSsrmeetEndTime() {
        return criteriaSsrmeetEndTime;
    }

    @JsonProperty("criteria.ssrmeetEndTime")
    public void setCriteriaSsrmeetEndTime(String criteriaSsrmeetEndTime) {
        this.criteriaSsrmeetEndTime = criteriaSsrmeetEndTime;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetEndTime(String criteriaSsrmeetEndTime) {
        this.criteriaSsrmeetEndTime = criteriaSsrmeetEndTime;
        return this;
    }

    @JsonProperty("criteria.ssrmeetBldgCode")
    public String getCriteriaSsrmeetBldgCode() {
        return criteriaSsrmeetBldgCode;
    }

    @JsonProperty("criteria.ssrmeetBldgCode")
    public void setCriteriaSsrmeetBldgCode(String criteriaSsrmeetBldgCode) {
        this.criteriaSsrmeetBldgCode = criteriaSsrmeetBldgCode;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetBldgCode(String criteriaSsrmeetBldgCode) {
        this.criteriaSsrmeetBldgCode = criteriaSsrmeetBldgCode;
        return this;
    }

    @JsonProperty("criteria.ssrmeetRoomCode")
    public String getCriteriaSsrmeetRoomCode() {
        return criteriaSsrmeetRoomCode;
    }

    @JsonProperty("criteria.ssrmeetRoomCode")
    public void setCriteriaSsrmeetRoomCode(String criteriaSsrmeetRoomCode) {
        this.criteriaSsrmeetRoomCode = criteriaSsrmeetRoomCode;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetRoomCode(String criteriaSsrmeetRoomCode) {
        this.criteriaSsrmeetRoomCode = criteriaSsrmeetRoomCode;
        return this;
    }

    @JsonProperty("criteria.ssrmeetSchdCode")
    public String getCriteriaSsrmeetSchdCode() {
        return criteriaSsrmeetSchdCode;
    }

    @JsonProperty("criteria.ssrmeetSchdCode")
    public void setCriteriaSsrmeetSchdCode(String criteriaSsrmeetSchdCode) {
        this.criteriaSsrmeetSchdCode = criteriaSsrmeetSchdCode;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetSchdCode(String criteriaSsrmeetSchdCode) {
        this.criteriaSsrmeetSchdCode = criteriaSsrmeetSchdCode;
        return this;
    }

    @JsonProperty("criteria.ssrmeetOverRide")
    public String getCriteriaSsrmeetOverRide() {
        return criteriaSsrmeetOverRide;
    }

    @JsonProperty("criteria.ssrmeetOverRide")
    public void setCriteriaSsrmeetOverRide(String criteriaSsrmeetOverRide) {
        this.criteriaSsrmeetOverRide = criteriaSsrmeetOverRide;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetOverRide(String criteriaSsrmeetOverRide) {
        this.criteriaSsrmeetOverRide = criteriaSsrmeetOverRide;
        return this;
    }

    @JsonProperty("criteria.ssrmeetCreditHrSess")
    public String getCriteriaSsrmeetCreditHrSess() {
        return criteriaSsrmeetCreditHrSess;
    }

    @JsonProperty("criteria.ssrmeetCreditHrSess")
    public void setCriteriaSsrmeetCreditHrSess(String criteriaSsrmeetCreditHrSess) {
        this.criteriaSsrmeetCreditHrSess = criteriaSsrmeetCreditHrSess;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetCreditHrSess(String criteriaSsrmeetCreditHrSess) {
        this.criteriaSsrmeetCreditHrSess = criteriaSsrmeetCreditHrSess;
        return this;
    }

    @JsonProperty("criteria.ssrmeetCatagory")
    public String getCriteriaSsrmeetCatagory() {
        return criteriaSsrmeetCatagory;
    }

    @JsonProperty("criteria.ssrmeetCatagory")
    public void setCriteriaSsrmeetCatagory(String criteriaSsrmeetCatagory) {
        this.criteriaSsrmeetCatagory = criteriaSsrmeetCatagory;
    }

    public CrossListMeetingTimeInstructorQuery100QapiPost withCriteriaSsrmeetCatagory(String criteriaSsrmeetCatagory) {
        this.criteriaSsrmeetCatagory = criteriaSsrmeetCatagory;
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

    public CrossListMeetingTimeInstructorQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CrossListMeetingTimeInstructorQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("keyblocXlstGroup");
        sb.append('=');
        sb.append(((this.keyblocXlstGroup == null)?"<null>":this.keyblocXlstGroup));
        sb.append(',');
        sb.append("criteriaMeetCrn");
        sb.append('=');
        sb.append(((this.criteriaMeetCrn == null)?"<null>":this.criteriaMeetCrn));
        sb.append(',');
        sb.append("criteriaSsrmeetStartDate");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetStartDate == null)?"<null>":this.criteriaSsrmeetStartDate));
        sb.append(',');
        sb.append("criteriaSsrmeetEndDate");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetEndDate == null)?"<null>":this.criteriaSsrmeetEndDate));
        sb.append(',');
        sb.append("criteriaSsrmeetMtypCode");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetMtypCode == null)?"<null>":this.criteriaSsrmeetMtypCode));
        sb.append(',');
        sb.append("criteriaMeetDays");
        sb.append('=');
        sb.append(((this.criteriaMeetDays == null)?"<null>":this.criteriaMeetDays));
        sb.append(',');
        sb.append("criteriaSsrmeetBeginTime");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetBeginTime == null)?"<null>":this.criteriaSsrmeetBeginTime));
        sb.append(',');
        sb.append("criteriaSsrmeetEndTime");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetEndTime == null)?"<null>":this.criteriaSsrmeetEndTime));
        sb.append(',');
        sb.append("criteriaSsrmeetBldgCode");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetBldgCode == null)?"<null>":this.criteriaSsrmeetBldgCode));
        sb.append(',');
        sb.append("criteriaSsrmeetRoomCode");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetRoomCode == null)?"<null>":this.criteriaSsrmeetRoomCode));
        sb.append(',');
        sb.append("criteriaSsrmeetSchdCode");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetSchdCode == null)?"<null>":this.criteriaSsrmeetSchdCode));
        sb.append(',');
        sb.append("criteriaSsrmeetOverRide");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetOverRide == null)?"<null>":this.criteriaSsrmeetOverRide));
        sb.append(',');
        sb.append("criteriaSsrmeetCreditHrSess");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetCreditHrSess == null)?"<null>":this.criteriaSsrmeetCreditHrSess));
        sb.append(',');
        sb.append("criteriaSsrmeetCatagory");
        sb.append('=');
        sb.append(((this.criteriaSsrmeetCatagory == null)?"<null>":this.criteriaSsrmeetCatagory));
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
        result = ((result* 31)+((this.criteriaSsrmeetBeginTime == null)? 0 :this.criteriaSsrmeetBeginTime.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetSchdCode == null)? 0 :this.criteriaSsrmeetSchdCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSsrmeetCatagory == null)? 0 :this.criteriaSsrmeetCatagory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrossListMeetingTimeInstructorQuery100QapiPost) == false) {
            return false;
        }
        CrossListMeetingTimeInstructorQuery100QapiPost rhs = ((CrossListMeetingTimeInstructorQuery100QapiPost) other);
        return (((((((((((((((((this.criteriaMeetDays == rhs.criteriaMeetDays)||((this.criteriaMeetDays!= null)&&this.criteriaMeetDays.equals(rhs.criteriaMeetDays)))&&((this.criteriaSsrmeetRoomCode == rhs.criteriaSsrmeetRoomCode)||((this.criteriaSsrmeetRoomCode!= null)&&this.criteriaSsrmeetRoomCode.equals(rhs.criteriaSsrmeetRoomCode))))&&((this.criteriaSsrmeetCreditHrSess == rhs.criteriaSsrmeetCreditHrSess)||((this.criteriaSsrmeetCreditHrSess!= null)&&this.criteriaSsrmeetCreditHrSess.equals(rhs.criteriaSsrmeetCreditHrSess))))&&((this.keyblocXlstGroup == rhs.keyblocXlstGroup)||((this.keyblocXlstGroup!= null)&&this.keyblocXlstGroup.equals(rhs.keyblocXlstGroup))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.criteriaSsrmeetOverRide == rhs.criteriaSsrmeetOverRide)||((this.criteriaSsrmeetOverRide!= null)&&this.criteriaSsrmeetOverRide.equals(rhs.criteriaSsrmeetOverRide))))&&((this.criteriaSsrmeetEndTime == rhs.criteriaSsrmeetEndTime)||((this.criteriaSsrmeetEndTime!= null)&&this.criteriaSsrmeetEndTime.equals(rhs.criteriaSsrmeetEndTime))))&&((this.criteriaSsrmeetStartDate == rhs.criteriaSsrmeetStartDate)||((this.criteriaSsrmeetStartDate!= null)&&this.criteriaSsrmeetStartDate.equals(rhs.criteriaSsrmeetStartDate))))&&((this.criteriaSsrmeetBldgCode == rhs.criteriaSsrmeetBldgCode)||((this.criteriaSsrmeetBldgCode!= null)&&this.criteriaSsrmeetBldgCode.equals(rhs.criteriaSsrmeetBldgCode))))&&((this.criteriaMeetCrn == rhs.criteriaMeetCrn)||((this.criteriaMeetCrn!= null)&&this.criteriaMeetCrn.equals(rhs.criteriaMeetCrn))))&&((this.criteriaSsrmeetMtypCode == rhs.criteriaSsrmeetMtypCode)||((this.criteriaSsrmeetMtypCode!= null)&&this.criteriaSsrmeetMtypCode.equals(rhs.criteriaSsrmeetMtypCode))))&&((this.criteriaSsrmeetEndDate == rhs.criteriaSsrmeetEndDate)||((this.criteriaSsrmeetEndDate!= null)&&this.criteriaSsrmeetEndDate.equals(rhs.criteriaSsrmeetEndDate))))&&((this.criteriaSsrmeetBeginTime == rhs.criteriaSsrmeetBeginTime)||((this.criteriaSsrmeetBeginTime!= null)&&this.criteriaSsrmeetBeginTime.equals(rhs.criteriaSsrmeetBeginTime))))&&((this.criteriaSsrmeetSchdCode == rhs.criteriaSsrmeetSchdCode)||((this.criteriaSsrmeetSchdCode!= null)&&this.criteriaSsrmeetSchdCode.equals(rhs.criteriaSsrmeetSchdCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSsrmeetCatagory == rhs.criteriaSsrmeetCatagory)||((this.criteriaSsrmeetCatagory!= null)&&this.criteriaSsrmeetCatagory.equals(rhs.criteriaSsrmeetCatagory))));
    }

}
