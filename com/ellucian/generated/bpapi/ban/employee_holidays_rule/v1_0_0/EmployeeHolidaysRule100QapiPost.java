
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
    "ecls",
    "date",
    "desc",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EmployeeHolidaysRule100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    private String ecls;
    /**
     * Holiday Date
     * <p>
     * Lineage reference object : PTREHOL_DATE
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Lineage reference object : PTREHOL_DATE")
    private Date date;
    /**
     * Description
     * <p>
     * Lineage reference object : PTREHOL_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTREHOL_DESC")
    private String desc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREHOL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTREHOL_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    public String getEcls() {
        return ecls;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ecls")
    public void setEcls(String ecls) {
        this.ecls = ecls;
    }

    public EmployeeHolidaysRule100QapiPost withEcls(String ecls) {
        this.ecls = ecls;
        return this;
    }

    /**
     * Holiday Date
     * <p>
     * Lineage reference object : PTREHOL_DATE
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
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public EmployeeHolidaysRule100QapiPost withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTREHOL_DESC
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
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EmployeeHolidaysRule100QapiPost withDesc(String desc) {
        this.desc = desc;
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

    public EmployeeHolidaysRule100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public EmployeeHolidaysRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeHolidaysRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ecls");
        sb.append('=');
        sb.append(((this.ecls == null)?"<null>":this.ecls));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        if ((other instanceof EmployeeHolidaysRule100QapiPost) == false) {
            return false;
        }
        EmployeeHolidaysRule100QapiPost rhs = ((EmployeeHolidaysRule100QapiPost) other);
        return ((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.ecls == rhs.ecls)||((this.ecls!= null)&&this.ecls.equals(rhs.ecls))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
