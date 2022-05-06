
package com.ellucian.generated.bpapi.ban.building_room_attribute_codes.v1_0_0;

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
    "schedulerNumber",
    "activityDate",
    "code",
    "autoSchedulerInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class BuildingRoomAttributeCodes100GetResponse {

    /**
     * Scheduler Number
     * <p>
     * Lineage reference object : STVRDEF_SCHEDULER_NUMBER
     * 
     */
    @JsonProperty("schedulerNumber")
    @JsonPropertyDescription("Lineage reference object : STVRDEF_SCHEDULER_NUMBER")
    private Double schedulerNumber;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVRDEF_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVRDEF_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVRDEF_CODE")
    private String code;
    /**
     * Lineage reference object : STVRDEF_AUTO_SCHEDULER_IND
     * 
     */
    @JsonProperty("autoSchedulerInd")
    @JsonPropertyDescription("Lineage reference object : STVRDEF_AUTO_SCHEDULER_IND")
    private String autoSchedulerInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVRDEF_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVRDEF_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Scheduler Number
     * <p>
     * Lineage reference object : STVRDEF_SCHEDULER_NUMBER
     * 
     */
    @JsonProperty("schedulerNumber")
    public Double getSchedulerNumber() {
        return schedulerNumber;
    }

    /**
     * Scheduler Number
     * <p>
     * Lineage reference object : STVRDEF_SCHEDULER_NUMBER
     * 
     */
    @JsonProperty("schedulerNumber")
    public void setSchedulerNumber(Double schedulerNumber) {
        this.schedulerNumber = schedulerNumber;
    }

    public BuildingRoomAttributeCodes100GetResponse withSchedulerNumber(Double schedulerNumber) {
        this.schedulerNumber = schedulerNumber;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BuildingRoomAttributeCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVRDEF_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVRDEF_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public BuildingRoomAttributeCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVRDEF_AUTO_SCHEDULER_IND
     * 
     */
    @JsonProperty("autoSchedulerInd")
    public String getAutoSchedulerInd() {
        return autoSchedulerInd;
    }

    /**
     * Lineage reference object : STVRDEF_AUTO_SCHEDULER_IND
     * 
     */
    @JsonProperty("autoSchedulerInd")
    public void setAutoSchedulerInd(String autoSchedulerInd) {
        this.autoSchedulerInd = autoSchedulerInd;
    }

    public BuildingRoomAttributeCodes100GetResponse withAutoSchedulerInd(String autoSchedulerInd) {
        this.autoSchedulerInd = autoSchedulerInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVRDEF_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVRDEF_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BuildingRoomAttributeCodes100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public BuildingRoomAttributeCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildingRoomAttributeCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schedulerNumber");
        sb.append('=');
        sb.append(((this.schedulerNumber == null)?"<null>":this.schedulerNumber));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("autoSchedulerInd");
        sb.append('=');
        sb.append(((this.autoSchedulerInd == null)?"<null>":this.autoSchedulerInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.schedulerNumber == null)? 0 :this.schedulerNumber.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.autoSchedulerInd == null)? 0 :this.autoSchedulerInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuildingRoomAttributeCodes100GetResponse) == false) {
            return false;
        }
        BuildingRoomAttributeCodes100GetResponse rhs = ((BuildingRoomAttributeCodes100GetResponse) other);
        return (((((((this.schedulerNumber == rhs.schedulerNumber)||((this.schedulerNumber!= null)&&this.schedulerNumber.equals(rhs.schedulerNumber)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.autoSchedulerInd == rhs.autoSchedulerInd)||((this.autoSchedulerInd!= null)&&this.autoSchedulerInd.equals(rhs.autoSchedulerInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
