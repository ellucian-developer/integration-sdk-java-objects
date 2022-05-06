
package com.ellucian.generated.bpapi.ban.schedule_calendar.v1_0_0;

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
    "acclDesc",
    "census2Enrl",
    "acclCode",
    "rfndCutOffDate",
    "sectStartDate",
    "census2Date",
    "enrl",
    "ptrmDesc",
    "ptrmCode",
    "sectBeginDate",
    "ptrmWeeks",
    "censusEnrl",
    "censusEnrlDate",
    "ptrmEndDate",
    "acadCutOffDate",
    "dropCutOffDate",
    "enrlCutOffDate",
    "sectNumDay",
    "sectNumWeek",
    "sectEndDate",
    "ptrmStartDate"
})
@Generated("jsonschema2pojo")
public class ScheduleCalendar100PutResponse {

    @JsonProperty("acclDesc")
    private String acclDesc;
    /**
     * Census Two Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("census2Enrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_2_ENRL")
    private Double census2Enrl;
    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("acclCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl")
    private String acclCode;
    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("rfndCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE")
    private Date rfndCutOffDate;
    /**
     * Calculated Section Start Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectStartDate")
    private Date sectStartDate;
    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_2_DATE")
    private Date census2Date;
    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("enrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ENRL")
    private Double enrl;
    @JsonProperty("ptrmDesc")
    private String ptrmDesc;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Session Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectBeginDate")
    private Date sectBeginDate;
    /**
     * Part of Term Number of Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("ptrmWeeks")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_WEEKS")
    private Double ptrmWeeks;
    /**
     * Census One Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("censusEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_ENRL")
    private Double censusEnrl;
    /**
     * Census One Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_ENRL_DATE")
    private Date censusEnrlDate;
    /**
     * Section End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_END_DATE")
    private Date ptrmEndDate;
    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("acadCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE")
    private Date acadCutOffDate;
    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("dropCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE")
    private Date dropCutOffDate;
    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("enrlCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE")
    private Date enrlCutOffDate;
    /**
     * Number of Days
     * <p>
     * 
     * 
     */
    @JsonProperty("sectNumDay")
    private Double sectNumDay;
    /**
     * Session Number of Weeks
     * <p>
     * 
     * 
     */
    @JsonProperty("sectNumWeek")
    private Double sectNumWeek;
    /**
     * Session End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectEndDate")
    private Date sectEndDate;
    /**
     * Section Begin Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_START_DATE")
    private Date ptrmStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("acclDesc")
    public String getAcclDesc() {
        return acclDesc;
    }

    @JsonProperty("acclDesc")
    public void setAcclDesc(String acclDesc) {
        this.acclDesc = acclDesc;
    }

    public ScheduleCalendar100PutResponse withAcclDesc(String acclDesc) {
        this.acclDesc = acclDesc;
        return this;
    }

    /**
     * Census Two Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("census2Enrl")
    public Double getCensus2Enrl() {
        return census2Enrl;
    }

    /**
     * Census Two Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("census2Enrl")
    public void setCensus2Enrl(Double census2Enrl) {
        this.census2Enrl = census2Enrl;
    }

    public ScheduleCalendar100PutResponse withCensus2Enrl(Double census2Enrl) {
        this.census2Enrl = census2Enrl;
        return this;
    }

    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("acclCode")
    public String getAcclCode() {
        return acclCode;
    }

    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("acclCode")
    public void setAcclCode(String acclCode) {
        this.acclCode = acclCode;
    }

    public ScheduleCalendar100PutResponse withAcclCode(String acclCode) {
        this.acclCode = acclCode;
        return this;
    }

    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("rfndCutOffDate")
    public Date getRfndCutOffDate() {
        return rfndCutOffDate;
    }

    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("rfndCutOffDate")
    public void setRfndCutOffDate(Date rfndCutOffDate) {
        this.rfndCutOffDate = rfndCutOffDate;
    }

    public ScheduleCalendar100PutResponse withRfndCutOffDate(Date rfndCutOffDate) {
        this.rfndCutOffDate = rfndCutOffDate;
        return this;
    }

    /**
     * Calculated Section Start Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectStartDate")
    public Date getSectStartDate() {
        return sectStartDate;
    }

    /**
     * Calculated Section Start Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectStartDate")
    public void setSectStartDate(Date sectStartDate) {
        this.sectStartDate = sectStartDate;
    }

    public ScheduleCalendar100PutResponse withSectStartDate(Date sectStartDate) {
        this.sectStartDate = sectStartDate;
        return this;
    }

    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    public Date getCensus2Date() {
        return census2Date;
    }

    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    public void setCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
    }

    public ScheduleCalendar100PutResponse withCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
        return this;
    }

    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("enrl")
    public Double getEnrl() {
        return enrl;
    }

    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("enrl")
    public void setEnrl(Double enrl) {
        this.enrl = enrl;
    }

    public ScheduleCalendar100PutResponse withEnrl(Double enrl) {
        this.enrl = enrl;
        return this;
    }

    @JsonProperty("ptrmDesc")
    public String getPtrmDesc() {
        return ptrmDesc;
    }

    @JsonProperty("ptrmDesc")
    public void setPtrmDesc(String ptrmDesc) {
        this.ptrmDesc = ptrmDesc;
    }

    public ScheduleCalendar100PutResponse withPtrmDesc(String ptrmDesc) {
        this.ptrmDesc = ptrmDesc;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public ScheduleCalendar100PutResponse withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Session Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectBeginDate")
    public Date getSectBeginDate() {
        return sectBeginDate;
    }

    /**
     * Session Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectBeginDate")
    public void setSectBeginDate(Date sectBeginDate) {
        this.sectBeginDate = sectBeginDate;
    }

    public ScheduleCalendar100PutResponse withSectBeginDate(Date sectBeginDate) {
        this.sectBeginDate = sectBeginDate;
        return this;
    }

    /**
     * Part of Term Number of Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("ptrmWeeks")
    public Double getPtrmWeeks() {
        return ptrmWeeks;
    }

    /**
     * Part of Term Number of Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("ptrmWeeks")
    public void setPtrmWeeks(Double ptrmWeeks) {
        this.ptrmWeeks = ptrmWeeks;
    }

    public ScheduleCalendar100PutResponse withPtrmWeeks(Double ptrmWeeks) {
        this.ptrmWeeks = ptrmWeeks;
        return this;
    }

    /**
     * Census One Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("censusEnrl")
    public Double getCensusEnrl() {
        return censusEnrl;
    }

    /**
     * Census One Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("censusEnrl")
    public void setCensusEnrl(Double censusEnrl) {
        this.censusEnrl = censusEnrl;
    }

    public ScheduleCalendar100PutResponse withCensusEnrl(Double censusEnrl) {
        this.censusEnrl = censusEnrl;
        return this;
    }

    /**
     * Census One Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    public Date getCensusEnrlDate() {
        return censusEnrlDate;
    }

    /**
     * Census One Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    public void setCensusEnrlDate(Date censusEnrlDate) {
        this.censusEnrlDate = censusEnrlDate;
    }

    public ScheduleCalendar100PutResponse withCensusEnrlDate(Date censusEnrlDate) {
        this.censusEnrlDate = censusEnrlDate;
        return this;
    }

    /**
     * Section End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    public Date getPtrmEndDate() {
        return ptrmEndDate;
    }

    /**
     * Section End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    public void setPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
    }

    public ScheduleCalendar100PutResponse withPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
        return this;
    }

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("acadCutOffDate")
    public Date getAcadCutOffDate() {
        return acadCutOffDate;
    }

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("acadCutOffDate")
    public void setAcadCutOffDate(Date acadCutOffDate) {
        this.acadCutOffDate = acadCutOffDate;
    }

    public ScheduleCalendar100PutResponse withAcadCutOffDate(Date acadCutOffDate) {
        this.acadCutOffDate = acadCutOffDate;
        return this;
    }

    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("dropCutOffDate")
    public Date getDropCutOffDate() {
        return dropCutOffDate;
    }

    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("dropCutOffDate")
    public void setDropCutOffDate(Date dropCutOffDate) {
        this.dropCutOffDate = dropCutOffDate;
    }

    public ScheduleCalendar100PutResponse withDropCutOffDate(Date dropCutOffDate) {
        this.dropCutOffDate = dropCutOffDate;
        return this;
    }

    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("enrlCutOffDate")
    public Date getEnrlCutOffDate() {
        return enrlCutOffDate;
    }

    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("enrlCutOffDate")
    public void setEnrlCutOffDate(Date enrlCutOffDate) {
        this.enrlCutOffDate = enrlCutOffDate;
    }

    public ScheduleCalendar100PutResponse withEnrlCutOffDate(Date enrlCutOffDate) {
        this.enrlCutOffDate = enrlCutOffDate;
        return this;
    }

    /**
     * Number of Days
     * <p>
     * 
     * 
     */
    @JsonProperty("sectNumDay")
    public Double getSectNumDay() {
        return sectNumDay;
    }

    /**
     * Number of Days
     * <p>
     * 
     * 
     */
    @JsonProperty("sectNumDay")
    public void setSectNumDay(Double sectNumDay) {
        this.sectNumDay = sectNumDay;
    }

    public ScheduleCalendar100PutResponse withSectNumDay(Double sectNumDay) {
        this.sectNumDay = sectNumDay;
        return this;
    }

    /**
     * Session Number of Weeks
     * <p>
     * 
     * 
     */
    @JsonProperty("sectNumWeek")
    public Double getSectNumWeek() {
        return sectNumWeek;
    }

    /**
     * Session Number of Weeks
     * <p>
     * 
     * 
     */
    @JsonProperty("sectNumWeek")
    public void setSectNumWeek(Double sectNumWeek) {
        this.sectNumWeek = sectNumWeek;
    }

    public ScheduleCalendar100PutResponse withSectNumWeek(Double sectNumWeek) {
        this.sectNumWeek = sectNumWeek;
        return this;
    }

    /**
     * Session End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectEndDate")
    public Date getSectEndDate() {
        return sectEndDate;
    }

    /**
     * Session End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sectEndDate")
    public void setSectEndDate(Date sectEndDate) {
        this.sectEndDate = sectEndDate;
    }

    public ScheduleCalendar100PutResponse withSectEndDate(Date sectEndDate) {
        this.sectEndDate = sectEndDate;
        return this;
    }

    /**
     * Section Begin Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    public Date getPtrmStartDate() {
        return ptrmStartDate;
    }

    /**
     * Section Begin Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    public void setPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
    }

    public ScheduleCalendar100PutResponse withPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
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

    public ScheduleCalendar100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleCalendar100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acclDesc");
        sb.append('=');
        sb.append(((this.acclDesc == null)?"<null>":this.acclDesc));
        sb.append(',');
        sb.append("census2Enrl");
        sb.append('=');
        sb.append(((this.census2Enrl == null)?"<null>":this.census2Enrl));
        sb.append(',');
        sb.append("acclCode");
        sb.append('=');
        sb.append(((this.acclCode == null)?"<null>":this.acclCode));
        sb.append(',');
        sb.append("rfndCutOffDate");
        sb.append('=');
        sb.append(((this.rfndCutOffDate == null)?"<null>":this.rfndCutOffDate));
        sb.append(',');
        sb.append("sectStartDate");
        sb.append('=');
        sb.append(((this.sectStartDate == null)?"<null>":this.sectStartDate));
        sb.append(',');
        sb.append("census2Date");
        sb.append('=');
        sb.append(((this.census2Date == null)?"<null>":this.census2Date));
        sb.append(',');
        sb.append("enrl");
        sb.append('=');
        sb.append(((this.enrl == null)?"<null>":this.enrl));
        sb.append(',');
        sb.append("ptrmDesc");
        sb.append('=');
        sb.append(((this.ptrmDesc == null)?"<null>":this.ptrmDesc));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("sectBeginDate");
        sb.append('=');
        sb.append(((this.sectBeginDate == null)?"<null>":this.sectBeginDate));
        sb.append(',');
        sb.append("ptrmWeeks");
        sb.append('=');
        sb.append(((this.ptrmWeeks == null)?"<null>":this.ptrmWeeks));
        sb.append(',');
        sb.append("censusEnrl");
        sb.append('=');
        sb.append(((this.censusEnrl == null)?"<null>":this.censusEnrl));
        sb.append(',');
        sb.append("censusEnrlDate");
        sb.append('=');
        sb.append(((this.censusEnrlDate == null)?"<null>":this.censusEnrlDate));
        sb.append(',');
        sb.append("ptrmEndDate");
        sb.append('=');
        sb.append(((this.ptrmEndDate == null)?"<null>":this.ptrmEndDate));
        sb.append(',');
        sb.append("acadCutOffDate");
        sb.append('=');
        sb.append(((this.acadCutOffDate == null)?"<null>":this.acadCutOffDate));
        sb.append(',');
        sb.append("dropCutOffDate");
        sb.append('=');
        sb.append(((this.dropCutOffDate == null)?"<null>":this.dropCutOffDate));
        sb.append(',');
        sb.append("enrlCutOffDate");
        sb.append('=');
        sb.append(((this.enrlCutOffDate == null)?"<null>":this.enrlCutOffDate));
        sb.append(',');
        sb.append("sectNumDay");
        sb.append('=');
        sb.append(((this.sectNumDay == null)?"<null>":this.sectNumDay));
        sb.append(',');
        sb.append("sectNumWeek");
        sb.append('=');
        sb.append(((this.sectNumWeek == null)?"<null>":this.sectNumWeek));
        sb.append(',');
        sb.append("sectEndDate");
        sb.append('=');
        sb.append(((this.sectEndDate == null)?"<null>":this.sectEndDate));
        sb.append(',');
        sb.append("ptrmStartDate");
        sb.append('=');
        sb.append(((this.ptrmStartDate == null)?"<null>":this.ptrmStartDate));
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
        result = ((result* 31)+((this.acclDesc == null)? 0 :this.acclDesc.hashCode()));
        result = ((result* 31)+((this.census2Enrl == null)? 0 :this.census2Enrl.hashCode()));
        result = ((result* 31)+((this.acclCode == null)? 0 :this.acclCode.hashCode()));
        result = ((result* 31)+((this.rfndCutOffDate == null)? 0 :this.rfndCutOffDate.hashCode()));
        result = ((result* 31)+((this.sectStartDate == null)? 0 :this.sectStartDate.hashCode()));
        result = ((result* 31)+((this.census2Date == null)? 0 :this.census2Date.hashCode()));
        result = ((result* 31)+((this.enrl == null)? 0 :this.enrl.hashCode()));
        result = ((result* 31)+((this.ptrmDesc == null)? 0 :this.ptrmDesc.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.sectBeginDate == null)? 0 :this.sectBeginDate.hashCode()));
        result = ((result* 31)+((this.ptrmWeeks == null)? 0 :this.ptrmWeeks.hashCode()));
        result = ((result* 31)+((this.censusEnrl == null)? 0 :this.censusEnrl.hashCode()));
        result = ((result* 31)+((this.censusEnrlDate == null)? 0 :this.censusEnrlDate.hashCode()));
        result = ((result* 31)+((this.ptrmEndDate == null)? 0 :this.ptrmEndDate.hashCode()));
        result = ((result* 31)+((this.acadCutOffDate == null)? 0 :this.acadCutOffDate.hashCode()));
        result = ((result* 31)+((this.dropCutOffDate == null)? 0 :this.dropCutOffDate.hashCode()));
        result = ((result* 31)+((this.enrlCutOffDate == null)? 0 :this.enrlCutOffDate.hashCode()));
        result = ((result* 31)+((this.sectNumDay == null)? 0 :this.sectNumDay.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sectNumWeek == null)? 0 :this.sectNumWeek.hashCode()));
        result = ((result* 31)+((this.sectEndDate == null)? 0 :this.sectEndDate.hashCode()));
        result = ((result* 31)+((this.ptrmStartDate == null)? 0 :this.ptrmStartDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleCalendar100PutResponse) == false) {
            return false;
        }
        ScheduleCalendar100PutResponse rhs = ((ScheduleCalendar100PutResponse) other);
        return (((((((((((((((((((((((this.acclDesc == rhs.acclDesc)||((this.acclDesc!= null)&&this.acclDesc.equals(rhs.acclDesc)))&&((this.census2Enrl == rhs.census2Enrl)||((this.census2Enrl!= null)&&this.census2Enrl.equals(rhs.census2Enrl))))&&((this.acclCode == rhs.acclCode)||((this.acclCode!= null)&&this.acclCode.equals(rhs.acclCode))))&&((this.rfndCutOffDate == rhs.rfndCutOffDate)||((this.rfndCutOffDate!= null)&&this.rfndCutOffDate.equals(rhs.rfndCutOffDate))))&&((this.sectStartDate == rhs.sectStartDate)||((this.sectStartDate!= null)&&this.sectStartDate.equals(rhs.sectStartDate))))&&((this.census2Date == rhs.census2Date)||((this.census2Date!= null)&&this.census2Date.equals(rhs.census2Date))))&&((this.enrl == rhs.enrl)||((this.enrl!= null)&&this.enrl.equals(rhs.enrl))))&&((this.ptrmDesc == rhs.ptrmDesc)||((this.ptrmDesc!= null)&&this.ptrmDesc.equals(rhs.ptrmDesc))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.sectBeginDate == rhs.sectBeginDate)||((this.sectBeginDate!= null)&&this.sectBeginDate.equals(rhs.sectBeginDate))))&&((this.ptrmWeeks == rhs.ptrmWeeks)||((this.ptrmWeeks!= null)&&this.ptrmWeeks.equals(rhs.ptrmWeeks))))&&((this.censusEnrl == rhs.censusEnrl)||((this.censusEnrl!= null)&&this.censusEnrl.equals(rhs.censusEnrl))))&&((this.censusEnrlDate == rhs.censusEnrlDate)||((this.censusEnrlDate!= null)&&this.censusEnrlDate.equals(rhs.censusEnrlDate))))&&((this.ptrmEndDate == rhs.ptrmEndDate)||((this.ptrmEndDate!= null)&&this.ptrmEndDate.equals(rhs.ptrmEndDate))))&&((this.acadCutOffDate == rhs.acadCutOffDate)||((this.acadCutOffDate!= null)&&this.acadCutOffDate.equals(rhs.acadCutOffDate))))&&((this.dropCutOffDate == rhs.dropCutOffDate)||((this.dropCutOffDate!= null)&&this.dropCutOffDate.equals(rhs.dropCutOffDate))))&&((this.enrlCutOffDate == rhs.enrlCutOffDate)||((this.enrlCutOffDate!= null)&&this.enrlCutOffDate.equals(rhs.enrlCutOffDate))))&&((this.sectNumDay == rhs.sectNumDay)||((this.sectNumDay!= null)&&this.sectNumDay.equals(rhs.sectNumDay))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sectNumWeek == rhs.sectNumWeek)||((this.sectNumWeek!= null)&&this.sectNumWeek.equals(rhs.sectNumWeek))))&&((this.sectEndDate == rhs.sectEndDate)||((this.sectEndDate!= null)&&this.sectEndDate.equals(rhs.sectEndDate))))&&((this.ptrmStartDate == rhs.ptrmStartDate)||((this.ptrmStartDate!= null)&&this.ptrmStartDate.equals(rhs.ptrmStartDate))));
    }

}
