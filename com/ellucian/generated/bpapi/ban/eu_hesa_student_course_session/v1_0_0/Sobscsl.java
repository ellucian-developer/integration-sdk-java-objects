
package com.ellucian.generated.bpapi.ban.eu_hesa_student_course_session.v1_0_0;

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
    "activityDate",
    "ssdtCodePrinonukSt",
    "venueId",
    "ssdtCodeDistanceSt",
    "studyProportion",
    "ssdtCodePrinonuk",
    "userId",
    "ssdtCodeDistance",
    "studyLocationId"
})
@Generated("jsonschema2pojo")
public class Sobscsl {

    /**
     * Lineage reference object : SOBSCSL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSCSL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Primarily Outside the UK Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodePrinonukSt")
    private String ssdtCodePrinonukSt;
    /**
     * Venue Identifier
     * <p>
     * Lineage reference object : SOBSCSL_VENUE_ID
     * 
     */
    @JsonProperty("venueId")
    @JsonPropertyDescription("Lineage reference object : SOBSCSL_VENUE_ID")
    private String venueId;
    /**
     * Distance Learning Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeDistanceSt")
    private String ssdtCodeDistanceSt;
    /**
     * Study Proportion
     * <p>
     * Lineage reference object : SOBSCSL_STUDY_PROPORTION
     * 
     */
    @JsonProperty("studyProportion")
    @JsonPropertyDescription("Lineage reference object : SOBSCSL_STUDY_PROPORTION")
    private Double studyProportion;
    /**
     * Primarily Outside the UK
     * <p>
     * Lineage reference object : SOBSCSL_SSDT_CODE_PRINONUK, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrinonuk")
    @JsonPropertyDescription("Lineage reference object : SOBSCSL_SSDT_CODE_PRINONUK, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodePrinonuk;
    /**
     * Lineage reference object : SOBSCSL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSCSL_USER_ID")
    private String userId;
    /**
     * Distance Learning
     * <p>
     * Lineage reference object : SOBSCSL_SSDT_CODE_DISTANCE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeDistance")
    @JsonPropertyDescription("Lineage reference object : SOBSCSL_SSDT_CODE_DISTANCE, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeDistance;
    /**
     * Study Location Identifier
     * <p>
     * Lineage reference object : SOBSCSL_STUDY_LOCATION_ID
     * (Required)
     * 
     */
    @JsonProperty("studyLocationId")
    @JsonPropertyDescription("Lineage reference object : SOBSCSL_STUDY_LOCATION_ID")
    private String studyLocationId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBSCSL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSCSL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobscsl withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Primarily Outside the UK Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodePrinonukSt")
    public String getSsdtCodePrinonukSt() {
        return ssdtCodePrinonukSt;
    }

    /**
     * Primarily Outside the UK Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodePrinonukSt")
    public void setSsdtCodePrinonukSt(String ssdtCodePrinonukSt) {
        this.ssdtCodePrinonukSt = ssdtCodePrinonukSt;
    }

    public Sobscsl withSsdtCodePrinonukSt(String ssdtCodePrinonukSt) {
        this.ssdtCodePrinonukSt = ssdtCodePrinonukSt;
        return this;
    }

    /**
     * Venue Identifier
     * <p>
     * Lineage reference object : SOBSCSL_VENUE_ID
     * 
     */
    @JsonProperty("venueId")
    public String getVenueId() {
        return venueId;
    }

    /**
     * Venue Identifier
     * <p>
     * Lineage reference object : SOBSCSL_VENUE_ID
     * 
     */
    @JsonProperty("venueId")
    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public Sobscsl withVenueId(String venueId) {
        this.venueId = venueId;
        return this;
    }

    /**
     * Distance Learning Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeDistanceSt")
    public String getSsdtCodeDistanceSt() {
        return ssdtCodeDistanceSt;
    }

    /**
     * Distance Learning Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeDistanceSt")
    public void setSsdtCodeDistanceSt(String ssdtCodeDistanceSt) {
        this.ssdtCodeDistanceSt = ssdtCodeDistanceSt;
    }

    public Sobscsl withSsdtCodeDistanceSt(String ssdtCodeDistanceSt) {
        this.ssdtCodeDistanceSt = ssdtCodeDistanceSt;
        return this;
    }

    /**
     * Study Proportion
     * <p>
     * Lineage reference object : SOBSCSL_STUDY_PROPORTION
     * 
     */
    @JsonProperty("studyProportion")
    public Double getStudyProportion() {
        return studyProportion;
    }

    /**
     * Study Proportion
     * <p>
     * Lineage reference object : SOBSCSL_STUDY_PROPORTION
     * 
     */
    @JsonProperty("studyProportion")
    public void setStudyProportion(Double studyProportion) {
        this.studyProportion = studyProportion;
    }

    public Sobscsl withStudyProportion(Double studyProportion) {
        this.studyProportion = studyProportion;
        return this;
    }

    /**
     * Primarily Outside the UK
     * <p>
     * Lineage reference object : SOBSCSL_SSDT_CODE_PRINONUK, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrinonuk")
    public String getSsdtCodePrinonuk() {
        return ssdtCodePrinonuk;
    }

    /**
     * Primarily Outside the UK
     * <p>
     * Lineage reference object : SOBSCSL_SSDT_CODE_PRINONUK, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodePrinonuk")
    public void setSsdtCodePrinonuk(String ssdtCodePrinonuk) {
        this.ssdtCodePrinonuk = ssdtCodePrinonuk;
    }

    public Sobscsl withSsdtCodePrinonuk(String ssdtCodePrinonuk) {
        this.ssdtCodePrinonuk = ssdtCodePrinonuk;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSCSL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobscsl withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Distance Learning
     * <p>
     * Lineage reference object : SOBSCSL_SSDT_CODE_DISTANCE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeDistance")
    public String getSsdtCodeDistance() {
        return ssdtCodeDistance;
    }

    /**
     * Distance Learning
     * <p>
     * Lineage reference object : SOBSCSL_SSDT_CODE_DISTANCE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeDistance")
    public void setSsdtCodeDistance(String ssdtCodeDistance) {
        this.ssdtCodeDistance = ssdtCodeDistance;
    }

    public Sobscsl withSsdtCodeDistance(String ssdtCodeDistance) {
        this.ssdtCodeDistance = ssdtCodeDistance;
        return this;
    }

    /**
     * Study Location Identifier
     * <p>
     * Lineage reference object : SOBSCSL_STUDY_LOCATION_ID
     * (Required)
     * 
     */
    @JsonProperty("studyLocationId")
    public String getStudyLocationId() {
        return studyLocationId;
    }

    /**
     * Study Location Identifier
     * <p>
     * Lineage reference object : SOBSCSL_STUDY_LOCATION_ID
     * (Required)
     * 
     */
    @JsonProperty("studyLocationId")
    public void setStudyLocationId(String studyLocationId) {
        this.studyLocationId = studyLocationId;
    }

    public Sobscsl withStudyLocationId(String studyLocationId) {
        this.studyLocationId = studyLocationId;
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

    public Sobscsl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobscsl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodePrinonukSt");
        sb.append('=');
        sb.append(((this.ssdtCodePrinonukSt == null)?"<null>":this.ssdtCodePrinonukSt));
        sb.append(',');
        sb.append("venueId");
        sb.append('=');
        sb.append(((this.venueId == null)?"<null>":this.venueId));
        sb.append(',');
        sb.append("ssdtCodeDistanceSt");
        sb.append('=');
        sb.append(((this.ssdtCodeDistanceSt == null)?"<null>":this.ssdtCodeDistanceSt));
        sb.append(',');
        sb.append("studyProportion");
        sb.append('=');
        sb.append(((this.studyProportion == null)?"<null>":this.studyProportion));
        sb.append(',');
        sb.append("ssdtCodePrinonuk");
        sb.append('=');
        sb.append(((this.ssdtCodePrinonuk == null)?"<null>":this.ssdtCodePrinonuk));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeDistance");
        sb.append('=');
        sb.append(((this.ssdtCodeDistance == null)?"<null>":this.ssdtCodeDistance));
        sb.append(',');
        sb.append("studyLocationId");
        sb.append('=');
        sb.append(((this.studyLocationId == null)?"<null>":this.studyLocationId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodePrinonukSt == null)? 0 :this.ssdtCodePrinonukSt.hashCode()));
        result = ((result* 31)+((this.venueId == null)? 0 :this.venueId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeDistanceSt == null)? 0 :this.ssdtCodeDistanceSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.studyProportion == null)? 0 :this.studyProportion.hashCode()));
        result = ((result* 31)+((this.ssdtCodePrinonuk == null)? 0 :this.ssdtCodePrinonuk.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeDistance == null)? 0 :this.ssdtCodeDistance.hashCode()));
        result = ((result* 31)+((this.studyLocationId == null)? 0 :this.studyLocationId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobscsl) == false) {
            return false;
        }
        Sobscsl rhs = ((Sobscsl) other);
        return (((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.ssdtCodePrinonukSt == rhs.ssdtCodePrinonukSt)||((this.ssdtCodePrinonukSt!= null)&&this.ssdtCodePrinonukSt.equals(rhs.ssdtCodePrinonukSt))))&&((this.venueId == rhs.venueId)||((this.venueId!= null)&&this.venueId.equals(rhs.venueId))))&&((this.ssdtCodeDistanceSt == rhs.ssdtCodeDistanceSt)||((this.ssdtCodeDistanceSt!= null)&&this.ssdtCodeDistanceSt.equals(rhs.ssdtCodeDistanceSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.studyProportion == rhs.studyProportion)||((this.studyProportion!= null)&&this.studyProportion.equals(rhs.studyProportion))))&&((this.ssdtCodePrinonuk == rhs.ssdtCodePrinonuk)||((this.ssdtCodePrinonuk!= null)&&this.ssdtCodePrinonuk.equals(rhs.ssdtCodePrinonuk))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeDistance == rhs.ssdtCodeDistance)||((this.ssdtCodeDistance!= null)&&this.ssdtCodeDistance.equals(rhs.ssdtCodeDistance))))&&((this.studyLocationId == rhs.studyLocationId)||((this.studyLocationId!= null)&&this.studyLocationId.equals(rhs.studyLocationId))));
    }

}
