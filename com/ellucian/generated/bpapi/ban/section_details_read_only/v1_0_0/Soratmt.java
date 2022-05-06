
package com.ellucian.generated.bpapi.ban.section_details_read_only.v1_0_0;

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
    "attendEnterInd",
    "activityDate",
    "entryStartDate",
    "trackAttendInd",
    "entryEndDate",
    "trackingUnitCde",
    "userId"
})
@Generated("jsonschema2pojo")
public class Soratmt {

    /**
     * Lineage reference object : SORATMT_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    @JsonPropertyDescription("Lineage reference object : SORATMT_ATTEND_ENTER_IND")
    private String attendEnterInd;
    /**
     * Lineage reference object : SORATMT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORATMT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATMT_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    @JsonPropertyDescription("Lineage reference object : SORATMT_ENTRY_START_DATE")
    private Date entryStartDate;
    /**
     * Lineage reference object : SORATMT_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    @JsonPropertyDescription("Lineage reference object : SORATMT_TRACK_ATTEND_IND")
    private String trackAttendInd;
    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATMT_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    @JsonPropertyDescription("Lineage reference object : SORATMT_ENTRY_END_DATE")
    private Date entryEndDate;
    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATMT_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    @JsonPropertyDescription("Lineage reference object : SORATMT_TRACKING_UNIT_CDE")
    private String trackingUnitCde;
    /**
     * Lineage reference object : SORATMT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORATMT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORATMT_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    public String getAttendEnterInd() {
        return attendEnterInd;
    }

    /**
     * Lineage reference object : SORATMT_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    public void setAttendEnterInd(String attendEnterInd) {
        this.attendEnterInd = attendEnterInd;
    }

    public Soratmt withAttendEnterInd(String attendEnterInd) {
        this.attendEnterInd = attendEnterInd;
        return this;
    }

    /**
     * Lineage reference object : SORATMT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORATMT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Soratmt withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATMT_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    public Date getEntryStartDate() {
        return entryStartDate;
    }

    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATMT_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    public void setEntryStartDate(Date entryStartDate) {
        this.entryStartDate = entryStartDate;
    }

    public Soratmt withEntryStartDate(Date entryStartDate) {
        this.entryStartDate = entryStartDate;
        return this;
    }

    /**
     * Lineage reference object : SORATMT_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    public String getTrackAttendInd() {
        return trackAttendInd;
    }

    /**
     * Lineage reference object : SORATMT_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    public void setTrackAttendInd(String trackAttendInd) {
        this.trackAttendInd = trackAttendInd;
    }

    public Soratmt withTrackAttendInd(String trackAttendInd) {
        this.trackAttendInd = trackAttendInd;
        return this;
    }

    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATMT_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    public Date getEntryEndDate() {
        return entryEndDate;
    }

    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATMT_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    public void setEntryEndDate(Date entryEndDate) {
        this.entryEndDate = entryEndDate;
    }

    public Soratmt withEntryEndDate(Date entryEndDate) {
        this.entryEndDate = entryEndDate;
        return this;
    }

    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATMT_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    public String getTrackingUnitCde() {
        return trackingUnitCde;
    }

    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATMT_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    public void setTrackingUnitCde(String trackingUnitCde) {
        this.trackingUnitCde = trackingUnitCde;
    }

    public Soratmt withTrackingUnitCde(String trackingUnitCde) {
        this.trackingUnitCde = trackingUnitCde;
        return this;
    }

    /**
     * Lineage reference object : SORATMT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORATMT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Soratmt withUserId(String userId) {
        this.userId = userId;
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

    public Soratmt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Soratmt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attendEnterInd");
        sb.append('=');
        sb.append(((this.attendEnterInd == null)?"<null>":this.attendEnterInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("entryStartDate");
        sb.append('=');
        sb.append(((this.entryStartDate == null)?"<null>":this.entryStartDate));
        sb.append(',');
        sb.append("trackAttendInd");
        sb.append('=');
        sb.append(((this.trackAttendInd == null)?"<null>":this.trackAttendInd));
        sb.append(',');
        sb.append("entryEndDate");
        sb.append('=');
        sb.append(((this.entryEndDate == null)?"<null>":this.entryEndDate));
        sb.append(',');
        sb.append("trackingUnitCde");
        sb.append('=');
        sb.append(((this.trackingUnitCde == null)?"<null>":this.trackingUnitCde));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.attendEnterInd == null)? 0 :this.attendEnterInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.entryStartDate == null)? 0 :this.entryStartDate.hashCode()));
        result = ((result* 31)+((this.trackAttendInd == null)? 0 :this.trackAttendInd.hashCode()));
        result = ((result* 31)+((this.entryEndDate == null)? 0 :this.entryEndDate.hashCode()));
        result = ((result* 31)+((this.trackingUnitCde == null)? 0 :this.trackingUnitCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Soratmt) == false) {
            return false;
        }
        Soratmt rhs = ((Soratmt) other);
        return (((((((((this.attendEnterInd == rhs.attendEnterInd)||((this.attendEnterInd!= null)&&this.attendEnterInd.equals(rhs.attendEnterInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.entryStartDate == rhs.entryStartDate)||((this.entryStartDate!= null)&&this.entryStartDate.equals(rhs.entryStartDate))))&&((this.trackAttendInd == rhs.trackAttendInd)||((this.trackAttendInd!= null)&&this.trackAttendInd.equals(rhs.trackAttendInd))))&&((this.entryEndDate == rhs.entryEndDate)||((this.entryEndDate!= null)&&this.entryEndDate.equals(rhs.entryEndDate))))&&((this.trackingUnitCde == rhs.trackingUnitCde)||((this.trackingUnitCde!= null)&&this.trackingUnitCde.equals(rhs.trackingUnitCde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
