
package com.ellucian.generated.bpapi.ban.partition_codes.v1_0_0;

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
    "campCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class PartitionCodes100GetRequest {

    /**
     * Scheduler
     * Sequence
     * <p>
     * Lineage reference object : GTVPARS_SCHEDULER_NUMBER
     * 
     */
    @JsonProperty("schedulerNumber")
    @JsonPropertyDescription("Lineage reference object : GTVPARS_SCHEDULER_NUMBER")
    private Double schedulerNumber;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVPARS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVPARS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : GTVPARS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVPARS_CODE")
    private String code;
    /**
     * Campus
     * <p>
     * Lineage reference object : GTVPARS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : GTVPARS_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVPARS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVPARS_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Scheduler
     * Sequence
     * <p>
     * Lineage reference object : GTVPARS_SCHEDULER_NUMBER
     * 
     */
    @JsonProperty("schedulerNumber")
    public Double getSchedulerNumber() {
        return schedulerNumber;
    }

    /**
     * Scheduler
     * Sequence
     * <p>
     * Lineage reference object : GTVPARS_SCHEDULER_NUMBER
     * 
     */
    @JsonProperty("schedulerNumber")
    public void setSchedulerNumber(Double schedulerNumber) {
        this.schedulerNumber = schedulerNumber;
    }

    public PartitionCodes100GetRequest withSchedulerNumber(Double schedulerNumber) {
        this.schedulerNumber = schedulerNumber;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVPARS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVPARS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PartitionCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVPARS_CODE
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
     * Lineage reference object : GTVPARS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PartitionCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : GTVPARS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : GTVPARS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public PartitionCodes100GetRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVPARS_DESC
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
     * Lineage reference object : GTVPARS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PartitionCodes100GetRequest withDesc(String desc) {
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

    public PartitionCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartitionCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
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
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartitionCodes100GetRequest) == false) {
            return false;
        }
        PartitionCodes100GetRequest rhs = ((PartitionCodes100GetRequest) other);
        return (((((((this.schedulerNumber == rhs.schedulerNumber)||((this.schedulerNumber!= null)&&this.schedulerNumber.equals(rhs.schedulerNumber)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
