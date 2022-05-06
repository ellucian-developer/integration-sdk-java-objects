
package com.ellucian.generated.bpapi.ban.leave_code_rule.v1_0_0;

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
    "code",
    "activityDate",
    "shortDesc",
    "longDesc"
})
@Generated("jsonschema2pojo")
public class LeaveCodeRule100GetRequest {

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PTRLEAV_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRLEAV_CODE")
    private String code;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLEAV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRLEAV_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Short Description
     * <p>
     * Lineage reference object : PTRLEAV_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    @JsonPropertyDescription("Lineage reference object : PTRLEAV_SHORT_DESC")
    private String shortDesc;
    /**
     * Long Description
     * <p>
     * Lineage reference object : PTRLEAV_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    @JsonPropertyDescription("Lineage reference object : PTRLEAV_LONG_DESC")
    private String longDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PTRLEAV_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Leave Code
     * <p>
     * Lineage reference object : PTRLEAV_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public LeaveCodeRule100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLEAV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLEAV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LeaveCodeRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : PTRLEAV_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : PTRLEAV_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public LeaveCodeRule100GetRequest withShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : PTRLEAV_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : PTRLEAV_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public LeaveCodeRule100GetRequest withLongDesc(String longDesc) {
        this.longDesc = longDesc;
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

    public LeaveCodeRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LeaveCodeRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("shortDesc");
        sb.append('=');
        sb.append(((this.shortDesc == null)?"<null>":this.shortDesc));
        sb.append(',');
        sb.append("longDesc");
        sb.append('=');
        sb.append(((this.longDesc == null)?"<null>":this.longDesc));
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
        result = ((result* 31)+((this.shortDesc == null)? 0 :this.shortDesc.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.longDesc == null)? 0 :this.longDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeaveCodeRule100GetRequest) == false) {
            return false;
        }
        LeaveCodeRule100GetRequest rhs = ((LeaveCodeRule100GetRequest) other);
        return ((((((this.shortDesc == rhs.shortDesc)||((this.shortDesc!= null)&&this.shortDesc.equals(rhs.shortDesc)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.longDesc == rhs.longDesc)||((this.longDesc!= null)&&this.longDesc.equals(rhs.longDesc))));
    }

}
