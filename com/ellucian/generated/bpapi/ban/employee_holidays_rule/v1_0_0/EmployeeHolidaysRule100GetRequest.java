
package com.ellucian.generated.bpapi.ban.employee_holidays_rule.v1_0_0;

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
    "date",
    "activityDate",
    "ecls",
    "desc"
})
@Generated("jsonschema2pojo")
public class EmployeeHolidaysRule100GetRequest {

    /**
     * Holiday Date
     * <p>
     * Lineage reference object : PTREHOL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : PTREHOL_DATE")
    private Date date;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREHOL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTREHOL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Employee Class Code
     * <p>
     * Lineage reference object : ecls
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    @JsonPropertyDescription("Lineage reference object : ecls")
    private String ecls;
    /**
     * Description
     * <p>
     * Lineage reference object : PTREHOL_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTREHOL_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Holiday Date
     * <p>
     * Lineage reference object : PTREHOL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Holiday Date
     * <p>
     * Lineage reference object : PTREHOL_DATE
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public EmployeeHolidaysRule100GetRequest withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREHOL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREHOL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EmployeeHolidaysRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Employee Class Code
     * <p>
     * Lineage reference object : ecls
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    public String getEcls() {
        return ecls;
    }

    /**
     * Employee Class Code
     * <p>
     * Lineage reference object : ecls
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    public void setEcls(String ecls) {
        this.ecls = ecls;
    }

    public EmployeeHolidaysRule100GetRequest withEcls(String ecls) {
        this.ecls = ecls;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTREHOL_DESC
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
     * Lineage reference object : PTREHOL_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EmployeeHolidaysRule100GetRequest withDesc(String desc) {
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

    public EmployeeHolidaysRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeHolidaysRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ecls");
        sb.append('=');
        sb.append(((this.ecls == null)?"<null>":this.ecls));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.ecls == null)? 0 :this.ecls.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeHolidaysRule100GetRequest) == false) {
            return false;
        }
        EmployeeHolidaysRule100GetRequest rhs = ((EmployeeHolidaysRule100GetRequest) other);
        return ((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.ecls == rhs.ecls)||((this.ecls!= null)&&this.ecls.equals(rhs.ecls))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
