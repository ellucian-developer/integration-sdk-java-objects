
package com.ellucian.generated.bpapi.ban.section_meeting_times.v1_0_0;

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
    "termCode",
    "crn",
    "meetCode",
    "mtypCode",
    "startDate",
    "endDate",
    "monDay",
    "tueDay",
    "wedDay",
    "thuDay",
    "friDay",
    "satDay",
    "sunDay",
    "beginTime",
    "endTime",
    "catagory"
})
@Generated("jsonschema2pojo")
public class SectionMeetingTimes100QapiPost {

    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("crn")
    private String crn;
    @JsonProperty("meetCode")
    private String meetCode;
    @JsonProperty("mtypCode")
    private String mtypCode;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("monDay")
    private String monDay;
    @JsonProperty("tueDay")
    private String tueDay;
    @JsonProperty("wedDay")
    private String wedDay;
    @JsonProperty("thuDay")
    private String thuDay;
    @JsonProperty("friDay")
    private String friDay;
    @JsonProperty("satDay")
    private String satDay;
    @JsonProperty("sunDay")
    private String sunDay;
    @JsonProperty("beginTime")
    private String beginTime;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("catagory")
    private String catagory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public SectionMeetingTimes100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public SectionMeetingTimes100QapiPost withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    @JsonProperty("meetCode")
    public String getMeetCode() {
        return meetCode;
    }

    @JsonProperty("meetCode")
    public void setMeetCode(String meetCode) {
        this.meetCode = meetCode;
    }

    public SectionMeetingTimes100QapiPost withMeetCode(String meetCode) {
        this.meetCode = meetCode;
        return this;
    }

    @JsonProperty("mtypCode")
    public String getMtypCode() {
        return mtypCode;
    }

    @JsonProperty("mtypCode")
    public void setMtypCode(String mtypCode) {
        this.mtypCode = mtypCode;
    }

    public SectionMeetingTimes100QapiPost withMtypCode(String mtypCode) {
        this.mtypCode = mtypCode;
        return this;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public SectionMeetingTimes100QapiPost withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public SectionMeetingTimes100QapiPost withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("monDay")
    public String getMonDay() {
        return monDay;
    }

    @JsonProperty("monDay")
    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public SectionMeetingTimes100QapiPost withMonDay(String monDay) {
        this.monDay = monDay;
        return this;
    }

    @JsonProperty("tueDay")
    public String getTueDay() {
        return tueDay;
    }

    @JsonProperty("tueDay")
    public void setTueDay(String tueDay) {
        this.tueDay = tueDay;
    }

    public SectionMeetingTimes100QapiPost withTueDay(String tueDay) {
        this.tueDay = tueDay;
        return this;
    }

    @JsonProperty("wedDay")
    public String getWedDay() {
        return wedDay;
    }

    @JsonProperty("wedDay")
    public void setWedDay(String wedDay) {
        this.wedDay = wedDay;
    }

    public SectionMeetingTimes100QapiPost withWedDay(String wedDay) {
        this.wedDay = wedDay;
        return this;
    }

    @JsonProperty("thuDay")
    public String getThuDay() {
        return thuDay;
    }

    @JsonProperty("thuDay")
    public void setThuDay(String thuDay) {
        this.thuDay = thuDay;
    }

    public SectionMeetingTimes100QapiPost withThuDay(String thuDay) {
        this.thuDay = thuDay;
        return this;
    }

    @JsonProperty("friDay")
    public String getFriDay() {
        return friDay;
    }

    @JsonProperty("friDay")
    public void setFriDay(String friDay) {
        this.friDay = friDay;
    }

    public SectionMeetingTimes100QapiPost withFriDay(String friDay) {
        this.friDay = friDay;
        return this;
    }

    @JsonProperty("satDay")
    public String getSatDay() {
        return satDay;
    }

    @JsonProperty("satDay")
    public void setSatDay(String satDay) {
        this.satDay = satDay;
    }

    public SectionMeetingTimes100QapiPost withSatDay(String satDay) {
        this.satDay = satDay;
        return this;
    }

    @JsonProperty("sunDay")
    public String getSunDay() {
        return sunDay;
    }

    @JsonProperty("sunDay")
    public void setSunDay(String sunDay) {
        this.sunDay = sunDay;
    }

    public SectionMeetingTimes100QapiPost withSunDay(String sunDay) {
        this.sunDay = sunDay;
        return this;
    }

    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    @JsonProperty("beginTime")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public SectionMeetingTimes100QapiPost withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SectionMeetingTimes100QapiPost withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @JsonProperty("catagory")
    public String getCatagory() {
        return catagory;
    }

    @JsonProperty("catagory")
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public SectionMeetingTimes100QapiPost withCatagory(String catagory) {
        this.catagory = catagory;
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

    public SectionMeetingTimes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionMeetingTimes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("meetCode");
        sb.append('=');
        sb.append(((this.meetCode == null)?"<null>":this.meetCode));
        sb.append(',');
        sb.append("mtypCode");
        sb.append('=');
        sb.append(((this.mtypCode == null)?"<null>":this.mtypCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
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
        sb.append("catagory");
        sb.append('=');
        sb.append(((this.catagory == null)?"<null>":this.catagory));
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
        result = ((result* 31)+((this.meetCode == null)? 0 :this.meetCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.wedDay == null)? 0 :this.wedDay.hashCode()));
        result = ((result* 31)+((this.tueDay == null)? 0 :this.tueDay.hashCode()));
        result = ((result* 31)+((this.catagory == null)? 0 :this.catagory.hashCode()));
        result = ((result* 31)+((this.sunDay == null)? 0 :this.sunDay.hashCode()));
        result = ((result* 31)+((this.thuDay == null)? 0 :this.thuDay.hashCode()));
        result = ((result* 31)+((this.friDay == null)? 0 :this.friDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mtypCode == null)? 0 :this.mtypCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.monDay == null)? 0 :this.monDay.hashCode()));
        result = ((result* 31)+((this.satDay == null)? 0 :this.satDay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionMeetingTimes100QapiPost) == false) {
            return false;
        }
        SectionMeetingTimes100QapiPost rhs = ((SectionMeetingTimes100QapiPost) other);
        return ((((((((((((((((((this.meetCode == rhs.meetCode)||((this.meetCode!= null)&&this.meetCode.equals(rhs.meetCode)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.wedDay == rhs.wedDay)||((this.wedDay!= null)&&this.wedDay.equals(rhs.wedDay))))&&((this.tueDay == rhs.tueDay)||((this.tueDay!= null)&&this.tueDay.equals(rhs.tueDay))))&&((this.catagory == rhs.catagory)||((this.catagory!= null)&&this.catagory.equals(rhs.catagory))))&&((this.sunDay == rhs.sunDay)||((this.sunDay!= null)&&this.sunDay.equals(rhs.sunDay))))&&((this.thuDay == rhs.thuDay)||((this.thuDay!= null)&&this.thuDay.equals(rhs.thuDay))))&&((this.friDay == rhs.friDay)||((this.friDay!= null)&&this.friDay.equals(rhs.friDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mtypCode == rhs.mtypCode)||((this.mtypCode!= null)&&this.mtypCode.equals(rhs.mtypCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.monDay == rhs.monDay)||((this.monDay!= null)&&this.monDay.equals(rhs.monDay))))&&((this.satDay == rhs.satDay)||((this.satDay!= null)&&this.satDay.equals(rhs.satDay))));
    }

}
