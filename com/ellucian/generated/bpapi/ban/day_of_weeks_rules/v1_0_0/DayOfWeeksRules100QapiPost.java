
package com.ellucian.generated.bpapi.ban.day_of_weeks_rules.v1_0_0;

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
    "code",
    "desc",
    "number",
    "sysreqInd"
})
@Generated("jsonschema2pojo")
public class DayOfWeeksRules100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVDAYS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVDAYS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Day
     * <p>
     * Lineage reference object : STVDAYS_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVDAYS_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVDAYS_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVDAYS_DESC")
    private String desc;
    /**
     * Number
     * <p>
     * Lineage reference object : STVDAYS_NUMBER
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Lineage reference object : STVDAYS_NUMBER")
    private String number;
    /**
     * Lineage reference object : STVDAYS_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    @JsonPropertyDescription("Lineage reference object : STVDAYS_SYSREQ_IND")
    private String sysreqInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVDAYS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVDAYS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DayOfWeeksRules100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Day
     * <p>
     * Lineage reference object : STVDAYS_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Day
     * <p>
     * Lineage reference object : STVDAYS_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DayOfWeeksRules100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVDAYS_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVDAYS_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DayOfWeeksRules100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : STVDAYS_NUMBER
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : STVDAYS_NUMBER
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public DayOfWeeksRules100QapiPost withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Lineage reference object : STVDAYS_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public String getSysreqInd() {
        return sysreqInd;
    }

    /**
     * Lineage reference object : STVDAYS_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public void setSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
    }

    public DayOfWeeksRules100QapiPost withSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
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

    public DayOfWeeksRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DayOfWeeksRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("sysreqInd");
        sb.append('=');
        sb.append(((this.sysreqInd == null)?"<null>":this.sysreqInd));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.sysreqInd == null)? 0 :this.sysreqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DayOfWeeksRules100QapiPost) == false) {
            return false;
        }
        DayOfWeeksRules100QapiPost rhs = ((DayOfWeeksRules100QapiPost) other);
        return (((((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.sysreqInd == rhs.sysreqInd)||((this.sysreqInd!= null)&&this.sysreqInd.equals(rhs.sysreqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
